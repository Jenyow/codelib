package com.codelib.springboot.sample.springsecurity.security;

public class RestAuthenticationFailureHandler {}
/*
@Component
public class RestAuthenticationFailureHandler implements AuthenticationFailureHandler {

	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException exception) throws IOException, ServletException {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write("{\"result\":\"error\"}");
		response.getWriter().flush();
	}

}
*/