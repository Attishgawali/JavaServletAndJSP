package com.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servlet2 extends HttpServlet{
protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		PrintWriter out = res.getWriter();
		Cookie[] cookies = req.getCookies();
		String username=null;
		for(Cookie c: cookies) {
			if(c.getName().equals("username")) {
				username=c.getValue();
				return;
			}
			else {
				out.println("You are new user");
			}
		}
		
		out.println("welcome back " + username);
		
	}
}
