package com.akshayprogramming;

public class Array6 {
	public static void main(String[] args) {
		int arr[]= {1,3,4,5,8,7,2,1};
		int temp=arr[0];
		int temp1=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<temp) {
				temp=arr[i];
			}
			if(arr[i]==temp) {
				arr[i]=Integer.MAX_VALUE;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<temp1) {
				temp1=arr[i];
			}
		}
		System.out.println(temp1);
//		--------------------------------------------
//		int arr1[]= {1,3,4,5,8,7,2,1};
//		int max1=Integer.MIN_VALUE;
//		int max2=Integer.MIN_VALUE;
//		for(int i:arr1) {
//			if(i>max1) {
//				max2=max1;
//				max1=i;
//			}
//			else if(i>max2) {
//				max2=i;
//			}
//		}
//		System.out.println(max1+" "+max2);
//		-------------------------------------------------
		int arr1[]= {1,3,4,5,8,7,2,1};
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		int max3=Integer.MIN_VALUE;
		for(int i:arr1) {
			if(i>max1) {
				max2=max1;
				max1=i;
			}
			else if(i>max2) {
				max3=max2;
				max2=i;
			}
			else if(i>max3) {
				max3=i;
			}
		}
		System.out.println(max1+" "+max2+" "+max3);
	}
}
