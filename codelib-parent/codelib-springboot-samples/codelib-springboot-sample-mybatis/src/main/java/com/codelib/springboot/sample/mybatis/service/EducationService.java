package com.codelib.springboot.sample.mybatis.service;

import com.codelib.springboot.sample.mybatis.pojo.Course;
import com.codelib.springboot.sample.mybatis.pojo.Student;

public interface EducationService {
	
	public int intsertCourse(Course course);

	public int intsertCourseTextbook(Course course);
	
	public int insertStudentCourses(Student student);
	
}
