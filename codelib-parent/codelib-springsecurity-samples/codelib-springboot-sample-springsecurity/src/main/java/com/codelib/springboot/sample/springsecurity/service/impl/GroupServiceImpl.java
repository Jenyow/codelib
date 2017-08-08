package com.codelib.springboot.sample.springsecurity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codelib.springboot.sample.springsecurity.mapper.GroupMapper;
import com.codelib.springboot.sample.springsecurity.pojo.Group;
import com.codelib.springboot.sample.springsecurity.service.GroupService;

@Service
public class GroupServiceImpl implements GroupService {

	@Autowired
	private GroupMapper groupMapper;

	@Override
	public Group selectByPrimaryKey(int id) {
		return groupMapper.selectByPrimaryKey(id);
	}

}
