package dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DBConnection {

	
			private static final String driverName = "com.mysql.jdbc.Driver";
			private static final String url = "jdbc:mysql://localhost:3306/jsp_web";
			private static final String username = "root";
			private static final String password = "12345";

			public static Connection getConnection() {
			
			Connection conn = null;
			
			try {
				Class.forName(driverName);
				conn = DriverManager.getConnection(url, username, password);
			
			} catch(Exception e) {
				e.printStackTrace();
			}
			return conn;
		}
}
