package com.codelib.springboot.sample.mybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codelib.springboot.sample.mybatis.mapper.GroupMapper;
import com.codelib.springboot.sample.mybatis.pojo.Group;
import com.codelib.springboot.sample.mybatis.service.GroupService;

@Service
public class GroupServiceImpl implements GroupService {

	@Autowired
	private GroupMapper groupMapper;

	@Override
	public Group selectByPrimaryKey(Long id) {
		return groupMapper.selectByPrimaryKey(id);
	}

}
