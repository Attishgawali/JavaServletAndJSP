package com.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class sqServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		PrintWriter out = res.getWriter();
		
		//GETTING DATA FROM REQUEST DISPATCHER
//		int k = (int)req.getAttribute("k");
//		k=k*k;
	
		//GETTING DATA FROM URL REWRITING
//		int k =(int)req.getParameter("k");
//		k=k*k;
			
		
		//GETTING DATA FROM HTTP SESSION
//		HttpSession session = req.getSession();
//		int k  = (int)session.getAttribute("k");
//		k = k*k;
//		System.out.println(k);
//		out.println("<h1>The product of value is k : "+ k + "</h1>");
		
		//GETTING DATA USING COOKIE
//		Cookie[] cookies = req.getCookies();
//		int k=0;
//		for(Cookie c: cookies) {
//			if(c.getName().equals("k")) {
//				k=Integer.parseInt(c.getValue());
//			}
//		}
//		out.println("<h1> The product of k is : "+ k + "</h1>");
		

	}

}
