package com.example.jwtSecurity.security;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

import com.example.jwtSecurity.model.JwtAuthenticationToken;

public class JwtAuthenticationProvider implements AuthenticationProvider{

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		return null;
	}

	@Override
	public boolean supports(Class<?> aClass) {
		return (JwtAuthenticationToken.class.isAssignableFrom(aClass));
	}
	
	https://www.youtube.com/watch?v=3s2lSD50-JI
		https://www.youtube.com/watch?v=-HYrUs1ZCLI

}
