package com.codelib.springboot.sample.springsecurity.service;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.codelib.springsecurity.sample.web.mapper.GroupMapper;

@RunWith(SpringRunner.class)
@SpringBootConfiguration
@Transactional
public class GroupServiceTest {

	@Autowired
    private GroupMapper groupMapper;
	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	@Ignore
	public void testSelectByPrimaryKey() {
		System.out.println(groupMapper.selectByPrimaryKey(1));
	}

}
