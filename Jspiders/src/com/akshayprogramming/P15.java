//Duplicate in a String
package com.akshayprogramming;

public class P15 {
	public static void main(String[] args) {
		String s = "Java";
		char []c = toCharArray(s); 
		freq(c);
		
	}
	
	public static char[] toCharArray(String s) {
		char c[] = new char[s.length()];
		for(int i=0;i<c.length;i++) {
			c[i]=s.charAt(i);
		}
		return c;
	}
	
	public static void freq(char[] c) {
		int arr[] = new int[c.length];
		for(int i =0;i<c.length;i++) {
			arr[i]=1;
			for(int j=i+1;j<c.length;j++) {
				if(c[i]!='@' && c[j]!='@' && c[i]==c[j]) {
					arr[i]++;
					c[j]='@';
				}
			}
		}
		for(int i =0;i<c.length;i++) {
			if(c[i]!='@') {
				if(arr[i]>1)
					System.out.println(c[i]+"---->"+arr[i]);
			}
		}
	}
	
	
}
