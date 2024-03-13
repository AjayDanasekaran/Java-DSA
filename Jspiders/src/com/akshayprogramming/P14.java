//Frequency of each character
package com.akshayprogramming;

public class P14 {
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
		int count=1;
		for(int i =0;i<c.length;i++) {
			for(int j=1;j<c.length;j++) {
				if(c[i]==c[j] && c[i] !='@' && c[j]!='@') {
					c[j]='@';
					arr[i] = count++;
				}
			}
			count = 1;
		}
		for(int i:arr) {
			System.out.println(i);
		}
		for(char i:c) {
			System.out.println(i);
		}
	}
	
//	public static void freq(char[] c) {
//		int arr[] = new int[c.length];
//		for(int i =0;i<c.length;i++) {
//			arr[i]=1;
//			for(int j=i+1;j<c.length;j++) {
//				if(c[i]!='@' && c[j]!='@' && c[i]==c[j]) {
//					arr[i]++;
//					c[j]='@';
//				}
//			}
//		}
//		for(int i =0;i<c.length;i++) {
//			if(c[i]!='@') {
//				System.out.println(c[i]+"---->"+arr[i]);
//			}
//		}
//	}
}
