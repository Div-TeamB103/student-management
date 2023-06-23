package com.div.schoolmanagement.repository;

import com.div.schoolmanagement.entity.Subject;
import com.div.schoolmanagement.inter.SubjectServiceInter;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

@Component
@RequiredArgsConstructor
public class SubjectRepository {

    private final JdbcTemplate template;

    public void createSubject(Subject subject) {
        String sql = "insert into subject(subject_name)" +
                "values(?)";
        PreparedStatementCallback<? extends Object> callback = ps -> {
            ps.setString(1, subject.getSubjectName());
            ps.execute();
            return ps;
        };
        template.execute(sql, callback);


    }

    public List<Subject> readAllSubject() {
        return template.query("select id, subject_name from subject ORDER BY id", new RowMapper<Subject>() {
            @Override
            public Subject mapRow(ResultSet rs, int rowNum) throws SQLException {
                return new Subject
                        (rs.getInt(1), rs.getString(2));
            }
        });
    }

    public void updateSubjectGetById(int id, Subject subject) {
        String sql = "update subject set subject_name=? where id=?" ;

        PreparedStatementCallback<? extends Object> callback = ps -> {

            ps.setString(1, subject.getSubjectName());
            ps.setInt(2, id);
            ps.execute();
            return ps;
        };
        template.execute(sql, callback);

    }

    public void deleteSubjectById(int id) {
        String sql = "delete from subject where id=?";
        PreparedStatementCallback<? extends Object> callback = ps -> {
            ps.setInt(1, id);
            ps.execute();
            return ps;
        };
        template.execute(sql, callback);
    }

    public Subject subjectGetById(int id) {
        String sql = "select id, subject_name from subject where id=?";

        return     template.query(sql , this::rowMapper, id).get(0);


        }
 private Subject rowMapper(ResultSet rs , int rowNum) throws SQLException{
     Subject subject = new Subject(rs.getInt(1) , rs.getString(2));

     return subject ;


 }

}
