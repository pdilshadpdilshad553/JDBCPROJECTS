package com.vc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insertdata {

	public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jeedb","root","admin");
			PreparedStatement st=con.prepareStatement("insert into student values( ?, ?, ?)"); 
			st.setInt(1, 103);
			st.setString(2, "pummy");
			st.setString(3, "html");
			int noofrows=st.executeUpdate();
			System.out.println("no of rows inserted"+noofrows);
			st.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	}

}
