package com.einfochips.demomvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UserDao {

	public boolean insertUser(User u)throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ACTIVITY21","root","root");
		PreparedStatement ps = con.prepareStatement("insert into info values (?,?,?,?,?)");
		ps.setString(1,u.getName());
		ps.setString(2,u.getEmail());
		ps.setString(3,u.getPassword());
		ps.setString(4,u.getAddress());
		ps.setString(5,u.getMobile());
		
		
		boolean b= ps.execute();
		con.close();
		return b;
	}
}