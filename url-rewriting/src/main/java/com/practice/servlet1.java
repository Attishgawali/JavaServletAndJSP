package com.practice;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servlet1 extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String username = req.getParameter("username");
		
		PrintWriter out = res.getWriter();
		
		out.println("<h1> Welcome "+username+ "<h1>");
		
		out.println("<a href='servlet2?username="+username+"'>Go to servlet2</a>");
		
		
	}
}
