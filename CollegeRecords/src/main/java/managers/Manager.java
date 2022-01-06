package managers;

import dao.Querier;
import com.mysql.cj.jdbc.MysqlDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import model.Debtor;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.String.valueOf;

public class Manager {
    ApplicationContext springContext;
    Connection connection;
    MysqlDataSource dataSource;

    public Manager() {
        springContext = new ClassPathXmlApplicationContext("config.xml");

        createConnection();
    }

    void createConnection() {
        try {
            dataSource = springContext.getBean(MysqlDataSource.class);

            connection = dataSource.getConnection();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void killConnection() {
        try {
            connection.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertRow(String nume, int grupa, int anStudii) {
        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(dataSource);
        Querier querier = springContext.getBean(Querier.class);

        String sql = querier.getInsert();
        Map<String, String> params = new HashMap<>();
        params.put("nume", nume);
        params.put("grupa", valueOf(grupa));
        params.put("an_studii", valueOf(anStudii));

        template.update(sql, params);
    }

    public void deleteRow(int studentID) {
        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(dataSource);
        Querier querier = springContext.getBean(Querier.class);

        String sql = querier.getDelete();
        SqlParameterSource param = new MapSqlParameterSource("student_id", valueOf(studentID));

        template.update(sql, param);
    }

    public void updateRow(String numeNou, int grupa, String numeVechi) {
        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(dataSource);
        Querier querier = springContext.getBean(Querier.class);

        String sql = querier.getUpdate();
        Map<String, String> params = new HashMap<>();
        params.put("nume_nou", numeNou);
        params.put("grupa", valueOf(grupa));
        params.put("nume_vechi", numeVechi);

        template.update(sql, params);
    }

    public Debtor queryOne() {
        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(dataSource);
        Querier querier = springContext.getBean(Querier.class);

        String sql = querier.getQuery() + " LIMIT 1";
        SqlParameterSource param = new MapSqlParameterSource("nota", "5");

        Debtor result = template.queryForObject(sql, param, new RowMapper<Debtor>() {
            @Override
            public Debtor mapRow(ResultSet rs, int rowNum) throws SQLException {
                Debtor debtor = new Debtor();
                debtor.setStudent_id(rs.getInt("student_id"));
                debtor.setNume(rs.getString("nume"));
                debtor.setGrupa_student(rs.getInt("grupaS"));
                debtor.setExamen_id(rs.getInt("examen_id"));
                debtor.setMaterie(rs.getString("materie"));
                debtor.setData(rs.getString("data"));
                debtor.setGrupa_examen(rs.getInt("grupaE"));
                debtor.setNota(rs.getInt("nota"));

                return debtor;
            }
        });

        return result;
    }

    public List<Debtor> queryAll() {
        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(dataSource);
        Querier querier = springContext.getBean(Querier.class);

        String sql = querier.getQuery();
        SqlParameterSource param = new MapSqlParameterSource("nota", "5");

        List<Debtor> results = template.query(sql, param, new RowMapper<Debtor>() {
            @Override
            public Debtor mapRow(ResultSet rs, int rowNum) throws SQLException {
                Debtor debtor = new Debtor();
                debtor.setStudent_id(rs.getInt("student_id"));
                debtor.setNume(rs.getString("nume"));
                debtor.setGrupa_student(rs.getInt("grupaS"));
                debtor.setExamen_id(rs.getInt("examen_id"));
                debtor.setMaterie(rs.getString("materie"));
                debtor.setData(rs.getString("data"));
                debtor.setGrupa_examen(rs.getInt("grupaE"));
                debtor.setNota(rs.getInt("nota"));

                return debtor;
            }
        });

        return results;
    }
}
