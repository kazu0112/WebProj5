package com.diworksdev.webproj5.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	
	/**
	 * JDBC ドライバー名
	 */
	private static String driverNmae = "com.mysql.cj.jdbc.Driver";
	/**
	 * データベース接続URL
	 */
	private static String url = "jdbc:mysql://localhost/testdb";
	/**
	 * データベース接続ユーザー名
	 */
	private static String user = "root";
	/**
	 * データベース接続パスワード
	 */
	private static String password = "root";
	
	public Connection grtConnection() {
		Connection con = null;
		try {
			Class.forName(driverNmae);
			con = DriverManager.getConnection(url,user,password);
		}	catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
