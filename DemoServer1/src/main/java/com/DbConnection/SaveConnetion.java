package com.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.servlet.Register1;

public class SaveConnetion {

	DbConnection db=new DbConnection();
	public void insertRegister(Register1 regi) throws SQLException {
		String insertQuery="insert into user_register(name,email,mobile)values(?,?,?)";
		Connection connection = db.getConnection();
		PreparedStatement ps=connection.prepareStatement(insertQuery);
		ps.setString(1,regi.getName());
		ps.setString(2,regi.getEmail());
		ps.setInt(3,regi.getMobile());
		int rows = ps.executeUpdate();
		System.out.println(rows+" user registered sucessfully");
	}
}
