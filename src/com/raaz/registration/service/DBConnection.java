package com.raaz.registration.service;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	public Connection get_connection() {
	
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Students?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","razendra");
			
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		return connection;
		
	}

}
