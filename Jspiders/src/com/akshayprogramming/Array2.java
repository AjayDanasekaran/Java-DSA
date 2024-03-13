package com.akshayprogramming;
import java.util.Arrays;
import java.util.Scanner;
public class Array2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
//		even indexes at an array using foreach
		int arr[] = {11,22,33,44,55,66};
//		int x = 0;
//		for(int i:arr) {
//			if(x%2==0) {
//				System.out.println(i);
//			}
//			x++;
//		}
		
//		from last index
//		int x = arr.length-1;
//		for(int i:arr) {
//				System.out.println(arr[x]);
//			x--;
//		}
		
//		input from user
		int a[] = new int[5];
		int x=0;
		for(int i:a) {
				a[x]=sc.nextInt();
			x++;
		}
		System.out.println(Arrays.toString(a));
//		for(int i:a) {
//			System.out.println(i);
//	}
		
	}
}
