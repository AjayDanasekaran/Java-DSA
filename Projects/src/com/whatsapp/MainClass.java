package com.whatsapp;
import java.util.Scanner;

public class MainClass {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter your phone number to verify");
		boolean b = PhoneNum.isValid(sc.next());
		System.out.println(b);
		System.out.println("Enter your otp to verify");
		System.out.println(Otp.abc);
		Otp.valOTP(sc.next());
	}
}
