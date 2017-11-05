package com.codelib.springdata.sample.jdbc.only.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.codelib.springdata.sample.jdbc.only.domain.Student;

public class StudentDAOImplTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testQuery() {
       StudentDAO studentDAO = new StudentDAOImpl();
       List<Student> students = studentDAO.query();
       
       for (Student student : students) {
           System.out.println(student);
       }
    }
    
    @Test
    public void testSave() {
        StudentDAO studentDAO = new StudentDAOImpl();
        Student student = new Student("test", 30);
        studentDAO.save(student);
    }

}
