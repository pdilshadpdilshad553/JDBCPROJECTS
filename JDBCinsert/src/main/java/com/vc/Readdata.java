package com.vc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Readdata {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jeedb","root","admin");
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("select * from student");
				while(rs.next()) {
					System.out.println(rs.getInt(1));
					System.out.println(rs.getString(2));
					System.out.println(rs.getString(3));
					System.out.println("***************************");
				}
				rs.close();
				st.close();
				con.close();
		}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

	


