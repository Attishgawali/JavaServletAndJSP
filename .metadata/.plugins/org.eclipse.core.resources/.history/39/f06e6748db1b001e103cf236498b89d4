package com.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;

public class servlet1 extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		PrintWriter out=res.getWriter();
		res.setContentType("text/html");
		
		String userName = req.getParameter("username");
		System.out.println("servlet1 is called ... username is : "+userName);
		
		out.println("<!DOCTYPE html>");
		out.println( "<html>" );
		out.println( "<head>" );
		out.println( "<title>welcome file</title>" );
		out.println( "</head>" );

		out.println( "<body>" );
		out.println("<h1> hello "+ userName+ "</h1>");
		RequestDispatcher rd = req.getRequestDispatcher("servlet2");
		rd.forward(req, res);
		
		//Creating cookie
		Cookie cookie = new Cookie("username",userName);
		res.addCookie(cookie);
		out.println( "</body>" );
		out.println( "</html>" );
		
	}
}
