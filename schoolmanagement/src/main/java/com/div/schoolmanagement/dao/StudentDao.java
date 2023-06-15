package com.div.schoolmanagement.dao;

import com.div.schoolmanagement.entity.Student;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentDao extends AbstractDao {

    public Student getStudentById(Integer studentId) {

        Student student = null;
        try (Connection connect = connect();
             PreparedStatement preparedStatement = connect.prepareStatement("select * from student where id=?")) {
            preparedStatement.setInt(1, studentId);
            preparedStatement.execute();

            ResultSet rs = preparedStatement.getResultSet();

            while (rs.next()) {
                student = getStudent(rs);
            }

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return student;
    }

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        try (Connection connect = connect();
             Statement statement = connect.createStatement()) {
            statement.execute("select * from student");
            ResultSet rs = statement.getResultSet();

            while (rs.next()) {
                students.add(getStudent(rs));
            }

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return students;
    }

    public void createStudent(Student student) {

    }

    public void updateStudent(Integer studentId, Student student) {

    }

    public void deleteStudent(Integer studentId) {

    }

    private Student getStudent(ResultSet rs) throws SQLException {
        Student student = new Student();
        student.setId(rs.getInt("id"));
        student.setName(rs.getString("surname"));
        student.setAge(rs.getInt("age"));
        student.setClassName(rs.getString("class_name"));

        return student;
    }

}
