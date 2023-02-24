package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SortBasedOnPhno {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/infosyshiring", "root", "root");
			Statement statement=connection.createStatement();
		ResultSet resultset=statement.executeQuery("select * from infosysemp where Phno like '99%' and gender='Male'");
		while(resultset.next()) {
			System.out.println("Employee Eid: "+resultset.getInt(1));
			System.out.println("Employee Ename: "+resultset.getString(2));
			System.out.println("Employee Age: "+resultset.getInt(3));
			System.out.println("Employee Gender: "+resultset.getString(4));
			System.out.println("Employee Phno: "+resultset.getInt(5));
			System.out.println("Employee Designation: "+resultset.getString(6));
			System.out.println("Employee Sal: "+resultset.getInt(7));
			System.out.println("---------------------------");
		}
		connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		}
}
