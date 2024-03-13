package com.akshayprogramming;

public class LargestNum {
	public static void main(String[] args) {
		int a[] = {1,3,5,7,9};
		int max = nthLargest(a,2);
		System.out.println(max);
	}
	public static int nthLargest(int[] a, int num) {
	    return nthLargestHelper(a, num, 0, Integer.MIN_VALUE);
	}

	private static int nthLargestHelper(int[] a, int num, int count, int currentLargest) {
	    if (count == num) {
	        return currentLargest;
	    }

	    for (int i = 0; i < a.length; i++) {
	        if (a[i] > currentLargest) {
	            currentLargest = a[i];
	        }
	    }

	    return nthLargestHelper(a, num, count + 1, currentLargest);
	}
}
