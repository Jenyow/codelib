package com.codelib.springboot.sample.springsecurity.security;

public class RestAuthenticationSuccessHandler {}

/*
@Component
public class RestAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write("{\"result\":\"ok\"}");
		response.getWriter().flush();

	}

}
*/