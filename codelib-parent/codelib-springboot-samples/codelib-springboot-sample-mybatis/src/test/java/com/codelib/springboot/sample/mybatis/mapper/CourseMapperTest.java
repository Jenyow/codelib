package com.codelib.springboot.sample.mybatis.mapper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.codelib.springboot.sample.mybatis.config.DruidDataSourceConfig;
import com.codelib.springboot.sample.mybatis.config.MyBatisConfig;
import com.codelib.springboot.sample.mybatis.pojo.Course;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={MyBatisConfig.class, DruidDataSourceConfig.class})
// 需要加事务，防止各用例间相互影响
@Transactional
public class CourseMapperTest {

	@Autowired
	private CourseMapper coursemapper;
	
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * 测试一对一关联查询
	 * 如果关联表中字段同名，需要给结果列取别名，以解决冲突
	 */
	@Test
	public void testSelectCourseTextbookResultMapByPrimaryKey() {
		Course course = coursemapper.selectCourseTextbookResultMapByPrimaryKey(1);
		String expected = "《高等数学》";
		String actual = course.getTextbook().getName();
		assertEquals(expected, actual);
	}

	@Test
	public void selectCourseStudentsResultMapByPrimaryKey() {
		Course course = coursemapper.selectCourseStudentsResultMapByPrimaryKey(1);
		int actual = course.getStudents().size();
		int expected = 3;
		assertEquals(expected, actual);
	}
	
	

}
