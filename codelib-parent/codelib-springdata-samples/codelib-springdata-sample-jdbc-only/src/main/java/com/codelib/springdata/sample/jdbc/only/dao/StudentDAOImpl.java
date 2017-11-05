package com.codelib.springdata.sample.jdbc.only.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.codelib.springdata.sample.jdbc.only.domain.Student;
import com.codelib.springdata.sample.jdbc.only.util.JDBCUtil;

public class StudentDAOImpl implements StudentDAO {

    @Override
    public List<Student> query() {
        List<Student> students = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        String sql = "select id, name, age from student";
        try {
            connection = JDBCUtil.getConnection();
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            
            Student student = null;
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                student = new Student(id, name, age);
                students.add(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.release(resultSet, statement, connection);
        }
        return students;
    }

    @Override
    public void save(Student student) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        String sql = "insert into student (name, age) value (?, ?)";
        try {
            connection = JDBCUtil.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setString(1, student.getName());
            statement.setInt(2, student.getAge());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.release(resultSet, statement, connection);
        }
    }

}
