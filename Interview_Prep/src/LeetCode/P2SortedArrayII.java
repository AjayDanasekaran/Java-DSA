package LeetCode;

import java.util.Arrays;

public class P2SortedArrayII {
	public static void main(String[] args) {
		int testCase1[] = {1,1,2};
		int testCase2[] = {0,0,1,1,1,2,2,3,3,4};
		godly(testCase2);
	}
	public static void godly(int arr[]) {
		int i=0;
		for(int n:arr) {
			if(i<2 || n>arr[i-2]) {
				arr[i++]=n;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
