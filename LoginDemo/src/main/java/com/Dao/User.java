package com.Dao;

public class User {
	
	private String userName;
	private String userPassword;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(String userName, String userPassword) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserPassword() {
		return userPassword;
	}


	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	
	
}
