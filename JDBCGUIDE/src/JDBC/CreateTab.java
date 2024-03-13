package JDBC;
import java.sql.*;

public class CreateTab {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/work";
		String user = "root";
		String pass = "root";
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, user, pass);
		Statement st = con.createStatement();
		st.execute("create table office(office_name varchar(20),office_id int)");
	}
}
