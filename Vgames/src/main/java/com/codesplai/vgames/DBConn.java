package com.codesplai.vgames;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collections;;

public class DBConn {

	private static final String URL = "jdbc:mysql://localhost/vgames";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";

	public static Connection getConn() throws SQLException {
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		return (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
	}

}
