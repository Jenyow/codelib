package com.codelib.webservice.sample.cxf.server.ws.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codelib.webservice.sample.cxf.server.ws.impl.HelloWSImpl;
import com.codelib.webservice.sample.cxf.server.ws.impl.HelloWSImplService;

/**
 * 调用 WebService
 * @author Jenyow
 *
 */
public class ClientTest {
	
	private static final Logger logger = LoggerFactory.getLogger(ClientTest.class);

	public static void main(String[] args) {
		HelloWSImplService factory = new HelloWSImplService();
		HelloWSImpl helloWS = factory.getHelloWSImplPort();
		logger.info(helloWS.toString());
		
		String result = helloWS.sayHello("Jenyow");
		logger.info("接受到的结果:{}", result);
	}
}
