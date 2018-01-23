package com.example.jwtSecurity.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;

public class JwtAuthenticationTokenFilter extends AbstractAuthenticationProcessingFilter{

	
	protected JwtAuthenticationTokenFilter() {
		super("/**");
	}

	@Override
	public Authentication attemptAuthentication(HttpServletRequest arg0, HttpServletResponse arg1)
			throws AuthenticationException, IOException, ServletException {
		return null;
	}

	

}
