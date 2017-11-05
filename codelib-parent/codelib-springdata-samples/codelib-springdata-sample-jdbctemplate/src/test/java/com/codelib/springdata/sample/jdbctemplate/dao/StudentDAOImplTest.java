package com.codelib.springdata.sample.jdbctemplate.dao;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.codelib.springdata.sample.jdbctemplate.WebApplication;
import com.codelib.springdata.sample.jdbctemplate.config.DruidDataSourceConfig;
import com.codelib.springdata.sample.jdbctemplate.domain.Student;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={DruidDataSourceConfig.class, WebApplication.class})
// 需要加事务，防止各用例间相互影响
@Transactional
public class StudentDAOImplTest {
    
    @Autowired
    private StudentDAO studentDAO;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testQuery() {
        List<Student> students = studentDAO.query();
        
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Test
    public void testSave() {
        Student student = new Student("testJDBC", 30);
        studentDAO.save(student);
    }

}
