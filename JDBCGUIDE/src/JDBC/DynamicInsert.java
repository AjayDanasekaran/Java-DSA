package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DynamicInsert {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/work";
		String user = "root";
		String pass = "root";
		
//		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, user, pass);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		int id = sc.nextInt();
		System.out.println("Enter Name");
		String name = sc.next();
		System.out.println("Enter location");
		String loc = sc.next();
		
		PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, loc);
		ps.executeUpdate();
	}
}
