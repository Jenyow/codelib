package com.codelib.springboot.sample.mybatis.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codelib.springboot.sample.mybatis.mapper.CourseMapper;
import com.codelib.springboot.sample.mybatis.mapper.StudentCourseMapper;
import com.codelib.springboot.sample.mybatis.mapper.TextbookMapper;
import com.codelib.springboot.sample.mybatis.pojo.Course;
import com.codelib.springboot.sample.mybatis.pojo.Student;
import com.codelib.springboot.sample.mybatis.pojo.StudentCourseKey;
import com.codelib.springboot.sample.mybatis.pojo.Textbook;
import com.codelib.springboot.sample.mybatis.service.EducationService;

@Service("educationService")
@Transactional
public class EducationServiceImpl implements EducationService {

	private static final Logger logger = LoggerFactory.getLogger(EducationServiceImpl.class);
	
	@Autowired
	private CourseMapper courseMapper;
	
	@Autowired
	private TextbookMapper textbookMapper;
	
	@Autowired
	private StudentCourseMapper studentCourseMapper;
	
	/**
	 * 一对一插入
	 * 当依赖的Textbook已经存在时，直接将数据插入courses表即可
	 * @param course
	 * @return
	 */
	@Override
	public int intsertCourse(Course course) {
		int result = 0;
		try {
			result = courseMapper.insert(course);
		} catch (Exception e) {
			logger.error("插入失败:{}", e.toString());
		}
		return result;
	}
	
	/**
	 * 一对一插入
	 * 当依赖的Textbook不存在时，需要先将数据插入Textbook，然后再插入Course
	 * @param course
	 * @return
	 */
	@Override
	public int intsertCourseTextbook(Course course) {
		int result = 0;
		try {
			Textbook textbook = course.getTextbook();
			textbookMapper.insert(textbook);
			// 关键在于 textbook 插入后获取 id
			course.setTextbookId(textbook.getId());
			courseMapper.insert(course);
			result = 1;
		} catch (Exception e) {
			logger.error("插入失败:{}", e.toString());
		}
		return result;
	}

	/**
	 * 多对多
	 * 对于 Student 和 Coureses 都已经存在，只是建立关联关系的情况
	 * 只需要往 student_courses 表插入数据即可
	 */
	@Override
	public int insertStudentCourses(Student student) {
		int result = 0;
		try {
			int studentId = student.getId();
			List<Course> courses = student.getCourses();
			for (Course course : courses) {
				StudentCourseKey studentCourseKey = new StudentCourseKey(course.getId(), studentId);
				studentCourseMapper.insert(studentCourseKey);
				result ++;
			}
		} catch (Exception e) {
			logger.error("插入失败:{}", e.toString());
		}
		return result;
	}

}
