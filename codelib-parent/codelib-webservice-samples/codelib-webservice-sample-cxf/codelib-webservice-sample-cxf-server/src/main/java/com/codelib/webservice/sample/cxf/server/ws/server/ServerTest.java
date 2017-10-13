package com.codelib.webservice.sample.cxf.server.ws.server;

import javax.xml.ws.Endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codelib.webservice.sample.cxf.server.ws.impl.HelloWSImpl;

/**
 * 发布 WebService
 * @author Jenyow
 *
 */
public class ServerTest {

	private static final Logger logger = LoggerFactory.getLogger(ServerTest.class);
	
	public static void main(String[] args) {
		String address = "http://localhost:8888/codelib-webservice-sample-cxf-server/hellows";
		Endpoint.publish(address, new HelloWSImpl());
		logger.info("WebService 发布成功");
	}
}
