package com.codelib.springboot.sample.mybatis.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codelib.springboot.sample.mybatis.mapper.CourseMapper;
import com.codelib.springboot.sample.mybatis.mapper.StudentMapper;
import com.codelib.springboot.sample.mybatis.mapper.TextbookMapper;
import com.codelib.springboot.sample.mybatis.pojo.Course;
import com.codelib.springboot.sample.mybatis.pojo.Student;
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
	private StudentMapper studentMapper;
	
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

	@Override
	public int insertStudentCourses(Student student) {
		int result = 0;
		try {
			
		} catch (Exception e) {
			logger.error("插入失败:{}", e.toString());
		}
		return result;
	}

}
