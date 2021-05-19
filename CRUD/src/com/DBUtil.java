package com;

import java.sql.*;

public class DBUtil {
	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String driver = "oracle.jdbc.driver.OracleDriver";
	private static final String username = "system";
	private static final String password = "tulasi.co";

	public static Connection getConnection() throws ClassNotFoundException,
			SQLException {
		Connection con = null;
		Class.forName(driver);

		con = DriverManager.getConnection(url, username, password);
		return con;
	}

	public static void closeStatement(PreparedStatement ps) throws SQLException {
		if (ps != null) {

			ps.close();
		}

	}

	public static void closeConnection(Connection con) throws SQLException {
		if (con != null) {

			con.close();

		}
	}
}
