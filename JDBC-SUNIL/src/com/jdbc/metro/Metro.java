package com.jdbc.metro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Metro {

	public static void main(String[] args) {

		String username = "root";
		String password = "Sunilksp@2409";
		String url = "jdbc:mysql://localhost:3306/xworkz";
		//String fqnOfDriverImpl = "com.mysql.cj.jdbc.Driver";

		try {
		//	Class.forName(fqnOfDriverImpl);
			Connection connection = DriverManager.getConnection(url, username, password);
			System.out.println(connection);

			String query = "insert into metro values(6,'ABC','BCD','XYZ','MNO',4)";
			Statement st = connection.createStatement();
			st.execute(query);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
