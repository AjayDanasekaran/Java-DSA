package com.jspy;

public class SecondwayJdbc {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
