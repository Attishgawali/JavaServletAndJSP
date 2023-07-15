package com.Dao;

import java.sql.*;
import com.Dao.ConnectionProvider;

public class UserDao {
	

	// CREATE STUDENT METHOD
	public void addUser(User user) {
		try {
			String q = "insert into user (username,password) values(?,?)";
			Connection con = ConnectionProvider.getConnection();
			PreparedStatement ps = con.prepareStatement(q);
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getUserPassword());

			int count = ps.executeUpdate();
			System.out.println(count + " row inserted successfully");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// READ STUDNET METHOD
	public User getuser(String username) {
		try {
			String q = "select * from user where username=?";

			User u = new User();
			Connection con = ConnectionProvider.getConnection();
			PreparedStatement ps = con.prepareStatement(q);
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();

			rs.next();
			u.setUserName(rs.getString(2));
			u.setUserPassword(rs.getString(3));
			return u;

		} catch (Exception e) {
			return null;
		}

	}

	// DELETE STUDENT BY ID METHOD

	public void removeUserByName(String username) {
		try {
			String q = "delete from user where username=?";
			Connection con = ConnectionProvider.getConnection();
			PreparedStatement ps = con.prepareStatement(q);
			ps.setString(1, username);
			int count = ps.executeUpdate();
			System.out.println(count + " row deleted successfully");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
