//Is the string a palindrome
package com.akshayprogramming;

public class P8 {
	public static void main(String[] args) {
		String s = "mom";

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
		if(res.equals(s)) {
			System.out.println(s+" is plaindrome");
		}
		else {
			System.out.println(s+" is not plaindrome");
		}
		
//		Second way
//		String res="";
//		for(int i = 0;i<s.length();i++) {
//			res=res+s.charAt(s.length()-1-i);
//		}
//		System.out.println(res);
		
		
	}
}

