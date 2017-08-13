package com.codelib.springsecurity.sample.web.security.config;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SecurityConfigTest {

	@Before
	public void setUp() throws Exception {
	}

	/**
	 * bcrypt加密解密
	 */
	@Test
	public void testEncoder() {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(16);
		String result = encoder.encode("myPassword");
		System.out.println(result);
		assertTrue(encoder.matches("myPassword", result));
	}

}
