package com.codelib.webservice.sample.cxf.server.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * SEI接口
 * @author Jenyow
 *
 */
@WebService
public interface HelloWS {

	@WebMethod
	public String sayHello(String name);
}
