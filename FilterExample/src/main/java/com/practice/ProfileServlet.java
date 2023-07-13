package com.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProfileServlet extends HttpServlet{
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		System.out.println("Prfile servlet Executed ...");
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>My Servlet Page</title>");
		out.println("</head>");
		out.println("<body>");
		
		out.println("<h1>Welcome to My Profle Servlet</h1>");

		out.println("</body>");
		out.println("</html>");

	}
}
