package com.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class suceessServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
		res.setContentType("text/html");
		PrintWriter writer = res.getWriter();
		String stuName = (String)req.getAttribute("stuName");
		String stuEmail = (String)req.getAttribute("stuEmail");
		String stuPass= (String)req.getAttribute("stuPass");
		writer.println("<h2>welcome "+ stuName +" You have sucessfully Register with your email id "+ stuEmail+ "</h2>");
		
	}
}
