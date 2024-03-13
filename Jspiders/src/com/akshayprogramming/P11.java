//Number of words in a String
package com.akshayprogramming;

public class P11 {
	public static void main(String[] args) {
		String s = " My name is Khan ";
		noOfWords(s);
	}
	
	public static void noOfWords(String s) {
		int count=0;
		for(int i =1;i<s.length();i++) {
			if((i==0 && s.charAt(i)!=' ') || (s.charAt(i-1)==' ' && s.charAt(i)!=' ')){
				count++;
			}
		}
		System.out.println(count);
	}
	
//	public static void noOfWords(String s) {
//		int count=0;
//		for(int i =0;i<s.length();i++) {
//			if((i==0 && s.charAt(i)!=' ') || (s.charAt(i)!=' ' && s.charAt(i-1)==' ' )){
//				count++;
//			}
//		}
//		System.out.println(count);
//	}
}
