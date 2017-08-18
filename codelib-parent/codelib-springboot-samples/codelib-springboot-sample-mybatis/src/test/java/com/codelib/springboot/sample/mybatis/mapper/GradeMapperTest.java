package com.codelib.springboot.sample.mybatis.mapper;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.codelib.springboot.sample.mybatis.config.DruidDataSourceConfig;
import com.codelib.springboot.sample.mybatis.config.MyBatisConfig;
import com.codelib.springboot.sample.mybatis.pojo.Grade;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={MyBatisConfig.class, DruidDataSourceConfig.class})
// 需要加事务，防止各用例间相互影响
@Transactional
public class GradeMapperTest {
	
	@Autowired
	private GradeMapper gradeMapper;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSelectGradeCoursesResultMapByPrimaryKey() {
		Grade grade = gradeMapper.selectGradeCoursesResultMapByPrimaryKey(1);
		int expected = 2;
		int actual = grade.getCourses().size();
		assertEquals(expected, actual);
	}

}
