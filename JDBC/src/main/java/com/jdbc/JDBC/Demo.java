package com.jdbc.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo {
 public static void main(String []args) throws ClassNotFoundException, SQLException 
 {
  Class.forName("com.mysql.cj.jdbc.Driver");
  Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "root");
  PreparedStatement ps = c.prepareStatement("insert into Book values(?,?,?,?)");
  Scanner s = new Scanner(System.in);
  System.out.println("Enter BookID");
  ps.setInt(1, s.nextInt());
  System.out.println("Enter BookName");
  ps.setString(2, s.next());
  System.out.println("Enter AuthorName");
  ps.setString(3, s.next());
  System.out.println("Enter Price");
  ps.setInt(4, s.nextInt());
  ps.executeUpdate();
  c.close();  
 }
}
