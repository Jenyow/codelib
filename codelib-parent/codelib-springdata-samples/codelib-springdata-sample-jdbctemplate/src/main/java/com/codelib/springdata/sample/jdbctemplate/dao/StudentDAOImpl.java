package com.codelib.springdata.sample.jdbctemplate.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import com.alibaba.druid.pool.DruidDataSource;
import com.codelib.springdata.sample.jdbctemplate.domain.Student;

/**
 * 通过Spring JdbcTemplate方式实现
 * @author Zhan Yao
 *
 * 2017年10月16日
 */
@Repository
public class StudentDAOImpl  implements StudentDAO {
    
    @Autowired
    private DruidDataSource dataSource;
    
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @Override
    public List<Student> query() {
        List<Student> students = new ArrayList<>();
        String sql = "select id, name, age from student";
        jdbcTemplate.query(sql, new RowCallbackHandler() {

            @Override
            public void processRow(ResultSet resultSet) throws SQLException {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                Student student = new Student(id, name, age);
                students.add(student);
            }
            
        });
        return students;
    }

    @Override
    public void save(Student student) {
        String sql = "insert into student (name, age) value (?, ?)";
        jdbcTemplate.update(sql, new Object[] {student.getName(), student.getAge()});
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource);
    }

}
