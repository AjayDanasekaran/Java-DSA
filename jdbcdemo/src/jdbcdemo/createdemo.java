package jdbcdemo;

import java.sql.*;

public class createdemo {
	public static void main(String[] args) throws Exception {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String pass = "system";
		String sql = "CREATE TABLE cricketers(jersery NUMBER, name VARCHAR2(20))";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,user,pass);
		System.out.println("connection sucessful");
		Statement st=con.createStatement();
		st.execute(sql);
	}
}

