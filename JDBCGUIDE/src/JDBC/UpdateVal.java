package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateVal {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/work";
		String user = "root";
		String pass = "root";
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, user, pass);
		Statement st = con.createStatement();
//		st.execute("update employee set empname='sahana' where empid=3");
		st.executeUpdate("update employee set empname='sana' where empid=3");
	}
}
