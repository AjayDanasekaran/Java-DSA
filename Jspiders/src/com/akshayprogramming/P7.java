//Reverse a string
package com.akshayprogramming;

public class P7 {
	public static void main(String[] args) {
		String s = "Jspiders";

//		Array way
//		char c[] = new char[s.length()];
//		for(int i = s.length()-1;i>=0;i--) {
//			c[i]=s.charAt(s.length()-1-i);
//		}
//		String s1 = new String(c);
//		System.out.println(s1);
		
//		First way
		String res="";
		for(int i = s.length()-1;i>=0;i--) {
			res=res+s.charAt(i);
		}
		System.out.println(res);
		
//		Second way
//		String res="";
//		for(int i = 0;i<s.length();i++) {
//			res=res+s.charAt(s.length()-1-i);
//		}
//		System.out.println(res);
		
		
	}
}

