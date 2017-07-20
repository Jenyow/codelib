package com.codelib.springboot.sample.mybatis.service;

import com.codelib.springboot.sample.mybatis.pojo.Group;

public interface GroupService {

	public Group selectByPrimaryKey(Long id);

}
