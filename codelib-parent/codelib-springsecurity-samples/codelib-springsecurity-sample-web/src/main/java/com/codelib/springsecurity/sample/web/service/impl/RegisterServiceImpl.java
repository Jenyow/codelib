package com.codelib.springsecurity.sample.web.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.codelib.springsecurity.sample.web.mapper.UserMapper;
import com.codelib.springsecurity.sample.web.pojo.User;
import com.codelib.springsecurity.sample.web.service.RegisterService;

@Service("regiserService")
public class RegisterServiceImpl implements RegisterService {
	
	private static final Logger logger = LoggerFactory.getLogger(RegisterServiceImpl.class);

	@Resource
	private BCryptPasswordEncoder passwordEncoder;
	
	@Resource
	private UserMapper userMapper;
	
	@Override
	public boolean registerUser(String username, String password) {
		String encodePassword = passwordEncoder.encode(password);
		logger.info("密码:{}, 加密结果:{}", password, encodePassword);
		User user = new User();
		user.setUsername(username);
		user.setPassword(encodePassword);
		user.setEnabled((short)1);
		int result = userMapper.insert(user);
		if (result >= 1) {
			return true;
		} else {
			return false;
		}
	}

}
