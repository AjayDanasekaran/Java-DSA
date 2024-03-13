//sorting a string
package com.akshayprogramming;


public class P6 {
	public static void main(String[] args) {
		String s = "ajay";
		char c[] = toCharArray(s);
		sortArray(c);
		String s1 = new String(c);
		System.out.println(s1);
		
	}
	
	public static char[] toCharArray(String s) {
		char c[] = new char[s.length()];
		for(int i=0;i<c.length;i++) {
			c[i]=s.charAt(i);
		}
		return c;
	}
	
	public static void sortArray(char c[]) {
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i]>c[j]) {
					char temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
		}
	}
}
