package dao;

import com.mysql.cj.jdbc.MysqlDataSource;
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

public class StudentDao {
    private MysqlDataSource dataSource;

    private String insertStudent;
    private String deleteStudent;
    private String updateStudent;
    private String queryStudent;

    public void killConnection() {
        try {
            Connection connection = dataSource.getConnection();
            connection.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertStudent(String name, int studyGroup, int studyYear) {
        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(dataSource);

        String sql = getInsertStudent();
        Map<String, String> params = new HashMap<>();
        params.put("name", name);
        params.put("studyGroup", valueOf(studyGroup));
        params.put("studyYear", valueOf(studyYear));

        template.update(sql, params);
    }

    public void deleteStudent(int studentId) {
        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(dataSource);

        String sql = getDeleteStudent();
        SqlParameterSource param = new MapSqlParameterSource("studentId", valueOf(studentId));

        template.update(sql, param);
    }

    public void updateStudent(String name, int studyGroup, int studyYear, int studentId) {
        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(dataSource);

        String sql = getUpdateStudent();
        Map<String, String> params = new HashMap<>();
        params.put("name", name);
        params.put("studyGroup", valueOf(studyGroup));
        params.put("studyYear", valueOf(studyYear));
        params.put("studentId", valueOf(studentId));

        template.update(sql, params);
    }

    public List<Debtor> queryDebtors() {
        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(dataSource);

        String sql = getQueryStudent();
        SqlParameterSource param = new MapSqlParameterSource("grade", "5");

        List<Debtor> results = template.query(sql, param, new RowMapper<Debtor>() {
            @Override
            public Debtor mapRow(ResultSet rs, int rowNum) throws SQLException {
                Debtor debtor = new Debtor();
                debtor.setStudentId(rs.getInt("student_id"));
                debtor.setName(rs.getString("name"));
                debtor.setGroupStudent(rs.getInt("group_student"));
                debtor.setExamId(rs.getInt("exam_id"));
                debtor.setSubject(rs.getString("subject"));
                debtor.setDate(rs.getString("date"));
                debtor.setGroupExam(rs.getInt("group_exam"));
                debtor.setGrade(rs.getInt("grade"));

                return debtor;
            }
        });

        return results;
    }

    public void setDataSource(MysqlDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public String getInsertStudent() {
        return insertStudent;
    }

    public void setInsertStudent(String insertStudent) {
        this.insertStudent = insertStudent;
    }

    public String getDeleteStudent() {
        return deleteStudent;
    }

    public void setDeleteStudent(String deleteStudent) {
        this.deleteStudent = deleteStudent;
    }

    public String getUpdateStudent() {
        return updateStudent;
    }

    public void setUpdateStudent(String updateStudent) {
        this.updateStudent = updateStudent;
    }

    public String getQueryStudent() {
        return queryStudent;
    }

    public void setQueryStudent(String queryStudent) {
        this.queryStudent = queryStudent;
    }
}
