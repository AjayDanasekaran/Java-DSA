//Converting uppercase to lowercase
package com.akshayprogramming;

public class P9 {

	public static void main(String[] args) {
		String a = "AjayLikesJAVA";
		System.out.println(toLowerCase(a));
	}
	
	public static String toLowerCase(String s) {
		String res = "";
		for (int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c>='A' && c<='Z') {
    			int x  = (int)c; //65
				x += 32;
				c = (char)x; //97
				res = res+c;
			}
			else {
				res = res+c;
			}
		}
		return res;
	}

}
