package dao;

import com.mysql.cj.jdbc.MysqlDataSource;
import model.Exam;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import static java.lang.String.valueOf;

public class ExamDao {
    private MysqlDataSource dataSource;

    private String insertExam;
    private String deleteExam;
    private String updateExam;
    private String queryExam;

    public void killConnection() {
        try {
            Connection connection = dataSource.getConnection();
            connection.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertExam(int studyGroup, String subject, String professorName, String date, int classroom) {
        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(dataSource);

        String sql = getInsertExam();
        Map<String, String> params = new HashMap<>();
        params.put("studyGroup", valueOf(studyGroup));
        params.put("subject", subject);
        params.put("professorName", professorName);
        params.put("date", date);
        params.put("classroom", valueOf(classroom));

        template.update(sql, params);
    }

    public void deleteExam(int examId) {
        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(dataSource);

        String sql = getDeleteExam();
        SqlParameterSource param = new MapSqlParameterSource("examId", valueOf(examId));

        template.update(sql, param);
    }

    public void updateExam(int studyGroup, String subject, String professorName, String date, int classroom, int examId) {
        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(dataSource);

        String sql = getUpdateExam();
        Map<String, String> params = new HashMap<>();
        params.put("studyGroup", valueOf(studyGroup));
        params.put("subject", subject);
        params.put("professorName", professorName);
        params.put("date", date);
        params.put("classroom", valueOf(classroom));
        params.put("examId", valueOf(examId));

        template.update(sql, params);
    }

    public Exam queryExam(int examId) {
        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(dataSource);

        String sql = getQueryExam();
        SqlParameterSource param = new MapSqlParameterSource("examId", valueOf(examId));

        Exam result = template.queryForObject(sql, param, new RowMapper<Exam>() {
            @Override
            public Exam mapRow(ResultSet rs, int rowNum) throws SQLException {
                Exam exam = new Exam();
                exam.setExamId(rs.getInt("exam_id"));
                exam.setStudyGroup(rs.getInt("study_group"));
                exam.setSubject(rs.getString("subject"));
                exam.setProfessorName(rs.getString("professor_name"));
                exam.setDate(rs.getString("date"));
                exam.setClassroom(rs.getInt("classroom"));

                return exam;
            }
        });

        return result;
    }

    public void setDataSource(MysqlDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public String getInsertExam() {
        return insertExam;
    }

    public void setInsertExam(String insertExam) {
        this.insertExam = insertExam;
    }

    public String getDeleteExam() {
        return deleteExam;
    }

    public void setDeleteExam(String deleteExam) {
        this.deleteExam = deleteExam;
    }

    public String getUpdateExam() {
        return updateExam;
    }

    public void setUpdateExam(String updateExam) {
        this.updateExam = updateExam;
    }

    public String getQueryExam() {
        return queryExam;
    }

    public void setQueryExam(String queryExam) {
        this.queryExam = queryExam;
    }
}
