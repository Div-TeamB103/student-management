package com.div.schoolmanagement.repository;

import com.div.schoolmanagement.entity.Teacher;
import com.div.schoolmanagement.repository.inter.AbstractDao;
import com.div.schoolmanagement.repository.inter.TeacherRepositoryInter;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class TeacherRepository extends AbstractDao implements TeacherRepositoryInter {

    public Optional<Teacher> getTeacherWithId(int id) {
        ResultSet resultSet;
        Optional<Teacher> teacher = null;
        try (Connection connection = connection();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM student_management.teachers WHERE id=?")) {
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.getResultSet();
            while (resultSet.next()) {
                teacher = Optional.of(getTeacherFromResultSet(resultSet));
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return teacher;
    }

    public List<Teacher> getAllTeachers() {
        ResultSet rs;
        List<Teacher> teachers = new ArrayList<>();
        try (Connection connection = connection();
             Statement statement = connection.createStatement()) {
            statement.execute("SELECT * FROM student_management.teachers");
            rs = statement.getResultSet();
            while (rs.next()) {
                teachers.add(getTeacherFromResultSet(rs));
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return teachers;
    }

    public void createTeacher(Teacher teacher) {
        try (Connection connection = connection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO student_management.teachers (name, surname, age, salary) " +
                     "VALUES (?,?,?,?)", Statement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setString(1, teacher.getName());
            preparedStatement.setString(2, teacher.getSurname());
            preparedStatement.setInt(3, teacher.getAge());
            preparedStatement.setInt(4, teacher.getSalary());

            preparedStatement.execute();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateTeacher(int id, Teacher teacher) {
        teacherList.stream().filter(teacherFromList -> teacherFromList.getId() == teacher.getId())
                .forEach(teacherFromList -> teacherList.set(teacherList.indexOf(teacherFromList), teacher));
    }

    public void deleteTeacher(int id) {
        teacherList.removeIf(teacherById -> teacherById.getId() == id);
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
