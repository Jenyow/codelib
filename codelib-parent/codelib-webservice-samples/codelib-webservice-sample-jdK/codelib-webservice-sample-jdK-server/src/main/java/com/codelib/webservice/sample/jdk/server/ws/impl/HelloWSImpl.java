package com.codelib.webservice.sample.jdk.server.ws.impl;

import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codelib.webservice.sample.jdk.server.ws.HelloWS;

/**
 * SEI接口实现
 * @author Jenyow
 *
 */
@WebService
public class HelloWSImpl implements HelloWS {
	
	private static final Logger logger = LoggerFactory.getLogger(HelloWSImpl.class);

	@Override
	public String sayHello(String name) {
		logger.info("WS Server 接受到名字:{}", name);
		return "Hello " + name;
	}

}
