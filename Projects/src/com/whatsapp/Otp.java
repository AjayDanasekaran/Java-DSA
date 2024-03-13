package com.whatsapp;

import java.util.Random;
public class Otp {
	String systemOTP,userOTP;
	static String s="";
	static int ranNo;
	
	public static String getOTP(int len)
	{
		for(int i=0;i<len;i++) {
			ranNo=new Random().nextInt(9);
			s= s.concat(Integer.toString(ranNo));
		}
		return s; 
	}
	static String abc = getOTP(4);
	
	static void valOTP(String num) {
		if(abc == num) {
			System.out.println("OTP verification successful");
		}
		else {
			System.out.println("OTP Mismatch/ verification unsuccessful");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("System Generated OTP is : "+abc);
	}
	
}

