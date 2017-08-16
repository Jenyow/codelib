package com.codelib.springsecurity.sample.web.service.impl;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.codelib.springsecurity.sample.web.mapper.GroupMapper;
import com.codelib.springsecurity.sample.web.mapper.GroupMemberMapper;
import com.codelib.springsecurity.sample.web.mapper.UserMapper;
import com.codelib.springsecurity.sample.web.pojo.Group;
import com.codelib.springsecurity.sample.web.pojo.User;
import com.codelib.springsecurity.sample.web.service.RegisterService;

@Service("regiserService")
public class RegisterServiceImpl implements RegisterService {
	
	private static final Logger logger = LoggerFactory.getLogger(RegisterServiceImpl.class);

	@Resource
	private BCryptPasswordEncoder passwordEncoder;
	
	@Resource
	private UserMapper userMapper;
	
	@Resource
	private GroupMapper groupMapper;
	
	@Resource
	private GroupMemberMapper groupMemberMapper;
	
	@Override
	public boolean registerUser(String username, String password) {
		String encodePassword = passwordEncoder.encode(password);
		logger.info("密码:{}, 加密结果:{}", password, encodePassword);
		// 得到用户组信息
		Group group =  groupMapper.selectByPrimaryKey(3);
		Set<Group> groups = new HashSet<>();
		groups.add(group);
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(encodePassword);
		user.setEnabled((short)1);// 激活帐号
		user.setGroups(groups);
		
		int result = userMapper.insert(user);
		if (result >= 1) {
			return true;
		} else {
			return false;
		}
	}

}
