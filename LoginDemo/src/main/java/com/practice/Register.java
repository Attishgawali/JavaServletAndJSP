package com.practice;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Dao.User;
import com.Dao.UserDao;

public class Register extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		String username = request.getParameter("username");
		String password = password = request.getParameter("password");
		
		UserDao ud = new UserDao();
		User user = ud.getuser(username);
		if(user==null) {
			User user2 = new User(username,password);
			ud.addUser(user2);
			response.sendRedirect("login.jsp");
		}else{
			
			response.sendRedirect("Register.jsp");
		}
		
		
	}
}