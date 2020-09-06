package com.raaz.registration.service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class EmployeeService {
	
	DBConnection dbcon = new DBConnection();  
	Connection con = dbcon.get_connection();
	
	PreparedStatement pa;
	

	public void getData() {
		try {
			String query = "select * from Employee";
			pa = con.prepareStatement(query);
			System.out.println(pa);
			pa.execute();
			ResultSet rs = pa.getResultSet();
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
		

			// Iterate through the data in the result set and display it.

			while (rs.next()) {
				// Print one row
				for (int i = 1; i <= columnsNumber; i++) {

					System.out.print(rs.getString(i) + " "); // Print one element of a row

				}

				System.out.println();// Move to the next line to print the next row.

			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
