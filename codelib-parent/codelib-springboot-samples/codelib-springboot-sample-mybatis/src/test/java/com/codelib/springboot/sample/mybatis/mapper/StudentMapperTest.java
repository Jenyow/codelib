package com.codelib.springboot.sample.mybatis.mapper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.codelib.springboot.sample.mybatis.config.DruidDataSourceConfig;
import com.codelib.springboot.sample.mybatis.config.MyBatisConfig;
import com.codelib.springboot.sample.mybatis.pojo.Student;
import com.codelib.springboot.sample.mybatis.pojo.StudentExample;
import com.codelib.springboot.sample.mybatis.pojo.StudentExample.Criteria;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={MyBatisConfig.class, DruidDataSourceConfig.class})
// 需要加事务，防止各用例间相互影响
@Transactional
public class StudentMapperTest {

	@Autowired  
    private StudentMapper studentMapper;
	
	@Rule
	public ExpectedException thrown= ExpectedException.none();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCountByExample() {
		StudentExample example = new StudentExample();
		example.setDistinct(true);
		Criteria criteria = example.createCriteria();
		criteria.andIdBetween(2, 4);
		long actual = studentMapper.countByExample(example);
		long expected = 3;
		assertEquals(expected, actual);
	}

	/**
	 * 测试条件删除
	 * 如果存在外键关联，将删除失败
	 */
	@Test
	public void testDeleteByExample() {
		StudentExample example = new StudentExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(5);
		int actual = studentMapper.deleteByExample(example);
		assertEquals(1, actual);	
	}

	@Test
	public void testDeleteByPrimaryKey() {
		int actual = studentMapper.deleteByPrimaryKey(5);
		assertEquals(1, actual);
	}

	/**
	 *  测试成功插入
	 */
	@Test
	public void testInsert() {
		Student student = new Student(0, "学生");  
        int actual = studentMapper.insert(student);
        int expected = 1;
        assertEquals(expected, actual);
	}
	
	/**
	 *  测试插入异常
	 */
	@Test(expected = Exception.class)
	public void testInsertException() {
		// 初始化数据中已经包含主键为 1 的数据
		Student student = new Student(1, "学生");
        studentMapper.insert(student);
	}
	
	/**
	 * 异常测试的第二种方法
	 */
	@Test
	public void testInsertException2() {
		// 初始化数据中已经包含主键为 1 的数据
		Student student = new Student(1, "学生");
		thrown.expect(Exception.class);// 需要在预期抛出异常的方法前设置预期异常结果
        studentMapper.insert(student);
	}

	/**
	 * 主键自增，所以插入时可以不设置主键
	 */
	@Test
	public void testInsertSelective() {
		String name = "学生";
		Student student = new Student();
		student.setName(name);
		int actual = studentMapper.insertSelective(student);
		assertEquals(1, actual);
	}

	@Test
	public void testSelectByExample() {
		StudentExample example = new StudentExample();
		example.setDistinct(true);
		example.setOrderByClause("id desc");
		Criteria criteria = example.createCriteria();
		criteria.andIdBetween(2, 4);
		List<Student> students = studentMapper.selectByExample(example);
		int expected = 3;
		int actual = students.size();
		assertEquals(expected, actual);
	}

	@Test
	public void testSelectByPrimaryKey() {
		int id = 1;
		Student student = studentMapper.selectByPrimaryKey(id);
		assertNotNull(student);
	}

	@Test
	public void testUpdateByExampleSelective() {
		String name = "赵改";
		Student student = new Student();
		student.setName(name);
		StudentExample example = new StudentExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(1);
		int actual = studentMapper.updateByExampleSelective(student, example);
		assertEquals(1, actual);
	}

	@Test
	public void testUpdateByExample() {
		Student student = new Student(1, "赵改");
		StudentExample example = new StudentExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(1);
		int actual = studentMapper.updateByExample(student, example);
		assertEquals(1, actual);
	}

	@Test
	public void testUpdateByPrimaryKeySelective() {
		Student student = new Student(1, "赵改");
		int actual = studentMapper.updateByPrimaryKeySelective(student);
		assertEquals(1, actual);
	}

	@Test
	public void testUpdateByPrimaryKey() {
		Student student = new Student(1, "赵改");
		int actual = studentMapper.updateByPrimaryKey(student);
		assertEquals(1, actual);
	}

}
