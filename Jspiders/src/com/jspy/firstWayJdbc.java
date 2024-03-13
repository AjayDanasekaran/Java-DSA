package com.jspy;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.*;

public class firstWayJdbc {
	public static void main(String[] args) throws SQLException {
		Driver d = new Driver();
		DriverManager.registerDriver(d);
	}
}
