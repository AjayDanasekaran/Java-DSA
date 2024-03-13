//Converting lowercase to uppercase 
package com.akshayprogramming;

public class P10 {

	public static void main(String[] args) {
		String a = "AjayLikesJAVA";
		System.out.println(toLowerCase(a));
	}
	
	public static String toLowerCase(String s) {
		String res = "";
		for (int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c>='a' && c<='z') {
				int x  = (int)c;
				x -= 32;
				c = (char)x;
				res = res+c;
			}
			else {
				res = res+c;
			}
		}
		return res;
	}

}
