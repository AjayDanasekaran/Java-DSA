package com.akshayprogramming;

public class MissingValue {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,6};
		for(int i=0;i<a.length;i++) {
			if(a[i]!=i+1) {
				System.out.println(i+1);
			}
		}
	}
}
