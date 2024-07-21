package myprojectutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {

	private static final String URL = "jdbc:mysql://localhost:3306/logininfo";
	private static final String USERNAME="root";
	private static final String PASSWORD="root";
	
	static {
		try {
			//Load the MYSQL JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() throws Exception {
		// TODO Auto-generated method stub
//		System.out.println("Connection building");
		return DriverManager.getConnection(URL,USERNAME,PASSWORD);
	}
	
}
