package com.div.schoolmanagement.repository;

import com.div.schoolmanagement.entity.Group;
import com.div.schoolmanagement.entity.Teacher;
import com.div.schoolmanagement.repository.inter.TeacherRepositoryInter;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class TeacherRepository implements TeacherRepositoryInter {
    private final JdbcTemplate jdbcTemplate;

    public List<Teacher> getAllTeachers() {
        return jdbcTemplate.query("select * from teachers", new BeanPropertyRowMapper<>(Teacher.class));
    }

    public Optional<Teacher> getTeacherById(Integer teacherId) {
        return null;
    }

    public void createTeacher(Teacher teacher) {

    }

    public void updateTeacher(Integer teacherId, Teacher teacher) {
    }

    public void deleteTeacher(Integer teacherId) {

    }


    //TODO I need creating a table with name "groups" and "subjects"
    @Override
    public void updateGroupsForTeacher(Integer teacherId, List<Group> groups) {

    }

    private Teacher getTeacherFromResultSet(ResultSet resultSet) throws SQLException {
        Teacher teacher = new Teacher();
        teacher.setId(resultSet.getInt("id"));
        teacher.setName(resultSet.getString("name"));
        teacher.setSurname(resultSet.getString("surname"));
        teacher.setAge(resultSet.getInt("age"));
        teacher.setSalary(resultSet.getInt("salary"));

        return teacher;
    }


}
