package com.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class register
 */

public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String userpassword = request.getParameter("userpassword");
		String useremail = request.getParameter("useremail");
		System.out.println(username);
		
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println( "<html>" );
		out.println( "<head>" );
		out.println( "<title>welcome file</title>" );
		out.println( "</head>" );
		out.println( "<body>" );
		out.println(username);
		out.println(userpassword);
		out.println(useremail);
		
		
		out.println( "</body>" );
		out.println( "</html>" );
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servletdemo","root","root12345");
			System.out.println("connection establish...");
			String q="insert into user(name,password,email) values(?,?,?)";
			
			PreparedStatement ps = con.prepareStatement(q);
			ps.setString(1, username);
			ps.setString(2, userpassword);
			ps.setString(3, useremail);
			ps.executeUpdate();
			
			out.println("<h2>Successfully register</h2>");
				
		} catch(Exception e) {
			e.printStackTrace();
			out.println("<h2> error ocured..</h2>");
		}

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
