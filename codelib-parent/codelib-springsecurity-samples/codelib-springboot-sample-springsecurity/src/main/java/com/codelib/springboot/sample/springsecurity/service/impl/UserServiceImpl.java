package com.codelib.springboot.sample.springsecurity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codelib.springboot.sample.springsecurity.mapper.UserMapper;
import com.codelib.springboot.sample.springsecurity.pojo.User;
import com.codelib.springboot.sample.springsecurity.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public User loadUserByUsername(String username) {
		User user = userMapper.selectByPrimaryKey(username);
		return user;
	}

}
