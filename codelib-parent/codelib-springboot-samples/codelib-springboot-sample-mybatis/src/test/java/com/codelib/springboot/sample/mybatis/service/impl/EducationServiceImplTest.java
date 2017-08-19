package com.codelib.springboot.sample.mybatis.service.impl;

import static org.junit.Assert.assertEquals;

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
import com.codelib.springboot.sample.mybatis.mapper.CourseMapper;
import com.codelib.springboot.sample.mybatis.pojo.Course;
import com.codelib.springboot.sample.mybatis.pojo.Textbook;
import com.codelib.springboot.sample.mybatis.service.EducationService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={MyBatisConfig.class, DruidDataSourceConfig.class, WebApplication.class})
// 需要加事务，防止各用例间相互影响
@Transactional
public class EducationServiceImplTest {

	@Autowired
	private EducationService educationService;
	
	@Autowired
	private CourseMapper courseMapper;
	
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

		//educationService.insertStudentCourses(student);
	}

}
