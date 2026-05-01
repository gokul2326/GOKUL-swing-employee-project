package empmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	 private static final String URL = "jdbc:mysql://localhost:3306/swing_emp_db";
	    private static final String USER = "root";
	    private static final String PASS = "Gokul@19@69!";

	    public static Connection getConnection() {
	        try {
	            return DriverManager.getConnection(URL, USER, PASS);
	        } catch(Exception e) {
	            e.printStackTrace();
	            return null;
	        }
	    }

}
