package com.akshayprogramming;
//printing an array using toString by overiding
public class Array3 {
	int a[] = new int[5];
	
	Array3(int a[]) {
		this.a=a;
	}
	@Override
	public String toString() {
		return "["+a[0]+","+a[1]+","+a[2]+","+a[3]+","+a[4]+"]";
	}
	public static void main(String[] args) {
		int arr[] = {55, 511, 121, 112, 11};
		Array3 arrm = new Array3(arr);
		System.out.println(arrm);
	}
}
