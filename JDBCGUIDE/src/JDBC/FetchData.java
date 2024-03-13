package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchData {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/work";
		String user = "root";
		String pass = "root";
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, user, pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from employee");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+":"+rs.getString(2)+" "+rs.getString(3));
		}
	}
}
