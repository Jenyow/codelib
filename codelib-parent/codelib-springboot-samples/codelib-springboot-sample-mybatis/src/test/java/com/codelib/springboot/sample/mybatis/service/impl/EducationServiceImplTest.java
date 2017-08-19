package com.codelib.springboot.sample.mybatis.service.impl;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.codelib.springboot.sample.mybatis.WebApplication;
import com.codelib.springboot.sample.mybatis.config.DruidDataSourceConfig;
import com.codelib.springboot.sample.mybatis.config.MyBatisConfig;
import com.codelib.springboot.sample.mybatis.pojo.Course;
import com.codelib.springboot.sample.mybatis.pojo.Student;
import com.codelib.springboot.sample.mybatis.pojo.Textbook;
import com.codelib.springboot.sample.mybatis.service.EducationService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={MyBatisConfig.class, DruidDataSourceConfig.class, WebApplication.class})
// 需要加事务，防止各用例间相互影响
@Transactional
public class EducationServiceImplTest {

	@Autowired
	private EducationService educationService;
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIntsertCourse() {		
		Course course = new Course();
		course.setName("新增课程");
		course.setGradeId(1);
		course.setTextbookId(1);
		int actual = educationService.intsertCourse(course);
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testIntsertCourseTextbook() {		
		Textbook textbook = new Textbook();
		textbook.setName("新增书");
		Course course = new Course();
		course.setName("新增课程");
		course.setGradeId(1);
		course.setTextbook(textbook);
		int actual = educationService.intsertCourseTextbook(course);
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	public void testInsertStudentCourses() {
		List<Course> courses = new ArrayList<>();
		for (int i = 1; i < 4; i++) {
			Course course = new Course();
			course.setId(i);
			courses.add(course);
		}
		Student student = new Student();
		student.setId(4);
		student.setCourses(courses);
		int actual = educationService.insertStudentCourses(student);
		int expected = 3;
		assertEquals(expected, actual);
	}

}
