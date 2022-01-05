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

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Manager {
    ApplicationContext springContext;
    Connection connection;
    MysqlDataSource dataSource;

    public Manager(String propsPath) {
        springContext = new ClassPathXmlApplicationContext("config.xml");

        createConnection(propsPath);
    }

    void createConnection(String propsPath) {
        Properties props = new Properties();
        FileInputStream fis;

        try {
            fis = new FileInputStream(propsPath);
            props.load(fis);

            dataSource = new MysqlDataSource();
            dataSource.setURL(props.getProperty("url"));
            dataSource.setUser(props.getProperty("user"));
            dataSource.setPassword(props.getProperty("password"));

            fis.close();

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

    public void insertRow() {
        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(dataSource);
        Querier querier = springContext.getBean(Querier.class);

        String sql = querier.getInsert();
        Map<String, String> params = new HashMap<>();
        params.put("nume", "Vali");
        params.put("grupa", "4");
        params.put("an_studii", "3");

        template.update(sql, params);
    }

    public void deleteRow() {
        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(dataSource);
        Querier querier = springContext.getBean(Querier.class);

        String sql = querier.getDelete();
        SqlParameterSource param = new MapSqlParameterSource("student_id", "15");

        template.update(sql, param);
    }

    public void updateRow() {
        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(dataSource);
        Querier querier = springContext.getBean(Querier.class);

        String sql = querier.getUpdate();
        Map<String, String> params = new HashMap<>();
        params.put("nume_nou", "Marian");
        params.put("grupa", "3");
        params.put("nume_vechi", "Vali");

        template.update(sql, params);
    }

    public void queryOne() {
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

        System.out.print(result.getStudent_id() + " ");
        System.out.print(result.getNume() + " ");
        System.out.print(result.getGrupa_student() + " ");
        System.out.print(result.getExamen_id() + " ");
        System.out.print(result.getMaterie() + " ");
        System.out.print(result.getData() + " ");
        System.out.print(result.getGrupa_examen() + " ");
        System.out.print(result.getNota() + "\n");
        System.out.println();
    }

    public void query() {
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

        for (Debtor debtor : results) {
            System.out.print(debtor.getStudent_id() + " ");
            System.out.print(debtor.getNume() + " ");
            System.out.print(debtor.getGrupa_student() + " ");
            System.out.print(debtor.getExamen_id() + " ");
            System.out.print(debtor.getMaterie() + " ");
            System.out.print(debtor.getData() + " ");
            System.out.print(debtor.getGrupa_examen() + " ");
            System.out.print(debtor.getNota() + "\n");
        }
        System.out.println();
    }
}
