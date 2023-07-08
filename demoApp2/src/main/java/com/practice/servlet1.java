package com.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servlet1 extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String stuName = req.getParameter("studetn_name");
		String stuEmail = req.getParameter("studetn_email");
		String stuPass = req.getParameter("studetn_password");
		
		String isAccpet = req.getParameter("condition");
		
		System.out.println(stuName);
		System.out.println(stuEmail);
		System.out.println(stuPass);
		System.out.println(isAccpet);
		
		if(isAccpet!=null) {
			//send to another servlet using ReqeustDispatcher
			req.setAttribute("stuName", stuName);
			req.setAttribute("stuEmail", stuEmail);
			req.setAttribute("stuPass", stuPass);
			RequestDispatcher rd = req.getRequestDispatcher("success");
			rd.forward(req, res);
		}else {
			PrintWriter writer = res.getWriter();
			writer.println("<h2 style='text-align: center;'>Please chekced the terms and condtions </h2>");
			//we including form again using ReqeustDispatcher
			res.setContentType("text/html");
			
			RequestDispatcher rd = req.getRequestDispatcher("form.html");
			
			rd.include(req, res);
		}
	}
	
}
