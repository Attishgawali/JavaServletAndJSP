package com.practice;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Cookie;


public class sevlet1 extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int i= Integer.parseInt(req.getParameter("t1"));
		int j = Integer.parseInt(req.getParameter("t2"));
		int k =i + j;
		
		
		
		
//		USING REQUEST DISPACTHER SENDING DATA OVER MULTIPLE SERVLET
//		req.setAttribute("k", k);
//		RequestDispatcher rd= req.getRequestDispatcher("sqServlet");
//		rd.forward(req, res);
		
//		USING SENDREDIRECT OR URLREWRTING SENDING DATA OVER MULTIPLE SERVLET
//		res.sendRedirect("sqServlet?k="+k);  //URL Rewriting
		
//		USING HTTPSESSION SENDING DATA OVER MULTIPLE SERVLET
//		HttpSession session = req.getSession();
//		session.setAttribute("k", k);
//		System.out.println(k);
//		res.sendRedirect("sqServlet");
		
		
		//USING COOKIES
//		Cookie cookie = new Cookie("k",k+"");
//		res.addCookie(cookie);
//		res.sendRedirect("sqServlet");
		


		

		
		
	}
	
}