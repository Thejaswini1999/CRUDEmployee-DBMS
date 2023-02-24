package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SalarayHike {
	public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/infosyshiring", "root", "root");
		Statement statement=connection.createStatement();
		statement.executeUpdate("Update infosysemp set sal=sal+9000 where designation='Developer'");
		connection.close();
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
}
}
