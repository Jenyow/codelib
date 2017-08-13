package com.codelib.springsecurity.sample.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codelib.springsecurity.sample.web.mapper.GroupMapper;
import com.codelib.springsecurity.sample.web.pojo.Group;
import com.codelib.springsecurity.sample.web.service.GroupService;

@Service
public class GroupServiceImpl implements GroupService {

	@Autowired
	private GroupMapper groupMapper;

	@Override
	public Group selectByPrimaryKey(int id) {
		return groupMapper.selectByPrimaryKey(id);
	}

}
