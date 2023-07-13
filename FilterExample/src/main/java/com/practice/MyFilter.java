package com.practice;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter{

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("Before Filter");
		//.. process data here before it reach to servlet
		
		chain.doFilter(req, res);
		System.out.println("After fileter");
		//..process data here before sending response to client
			
	}
	
}
