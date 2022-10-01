package com.hrms.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	public static Connection connection() {

		Connection conn = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		String url = "jdbc:mysql://localhost:3306/hrms";

		try {
			conn = DriverManager.getConnection(url, "root", "root");
		} catch (SQLException e) {
			System.out.println("Something Went Wrong..!");
		}

		return conn;
	}
}
