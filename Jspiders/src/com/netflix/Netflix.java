package com.netflix;

public interface Netflix {
	void Genre();
	void play();
	void stop();
	void displayDetails();
}
abstract class Movies implements Netflix{
	
	@Override
	public void Genre() {
		System.out.println("Choose a Movie Genre");
	}

	@Override
	public void play() {
		System.out.println("Play Movie");
	}

	@Override
	public void stop() {
		System.out.println("Stop Movie");
	}	
}
abstract class Series implements Netflix{
	@Override
	public void Genre() {
		System.out.println("Choose a Genre");
	}

	@Override
	public void play() {
		System.out.println("Play Movie");
	}

	@Override
	public void stop() {
		System.out.println("Stop Movie");
	}	
}
abstract class Account implements Netflix{
	private static long acc_no = 346267;
	private static String acc_name = "Ajay";
	private static long phone_no = 934549572;
	private static String pet_name = "Rosey";
	private static String password = "Jspy@123";
	
	public static void setPassword(String password) {
		Account.password = password;
	}

	public static long getPhone_no() {
		return phone_no;
	}

	public static void setPhone_no(long phone_no) {
		Account.phone_no = phone_no;
	}

	public static String getPet_name() {
		return pet_name;
	}

	public static void setPet_name(String pet_name) {
		Account.pet_name = pet_name;
	}

	public static String getAcc_name() {
		return acc_name;
	}

	public static void setAcc_name(String acc_name) {
		Account.acc_name = acc_name;
	}

	public static long getAcc_no() {
		return acc_no;
	}

	public static void setAcc_no(long acc_no) {
		Account.acc_no = acc_no;
	}

	@Override
	public void displayDetails() {
		System.out.println("Stop Movie");
	}	
}
