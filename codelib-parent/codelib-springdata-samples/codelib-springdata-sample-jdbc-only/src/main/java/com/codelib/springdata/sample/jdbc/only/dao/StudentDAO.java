package com.codelib.springdata.sample.jdbc.only.dao;

import java.util.List;

import com.codelib.springdata.sample.jdbc.only.domain.Student;

public interface StudentDAO {

    /**
     * 查询所有学生
     * @return 返回所有学生
     */
    public List<Student> query();
    
    public void save(Student student);
    
}
