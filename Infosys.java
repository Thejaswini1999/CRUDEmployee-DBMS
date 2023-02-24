package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Infosys {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/infosyshiring", "root", "root");
		Statement statement=connection.createStatement();
		statement.execute("Insert into Infosysemp values(101,'Theja',22,'Female',7619465,'Developer',400000)");
		statement.execute("Insert into Infosysemp values(102,'Yashu',26,'Male',7026448,'Testing',300000)");
		statement.execute("Insert into Infosysemp values(103,'Souji',28,'Female',7846245,'Developer',450000)");
		statement.execute("Insert into Infosysemp values(104,'Ranjitha',34,'Female',9874558,'BPM',350000)");
		statement.execute("Insert into Infosysemp values(105,'Prajwal',53,'Male',789456,'Accountant',250000)");
		statement.execute("Insert into Infosysemp values(106,'Poorvika',66,'Male',998745,'Data Science',350000)");
		statement.execute("Insert into Infosysemp values(107,'Mythri',24,'Female',8451255,'Developer',250000)");
		statement.execute("Insert into Infosysemp values(108,'Preetham',22,'Male',7846894,'Testing',450000)");
		statement.execute("Insert into Infosysemp values(109,'Amma',69,'Female',7851253,'Manager',600000)");
		statement.execute("Insert into Infosysemp values(110,'Appa',72,'Male',9980066,'HR',800000)");
		connection.close();
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
}
}
