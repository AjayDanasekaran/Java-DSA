package SortAlgo;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr= {1,4,6,8,2,5,3,0,7};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					arr[j]=arr[j]^arr[j+1];
					arr[j+1]=arr[j]^arr[j+1];
					arr[j]=arr[j]^arr[j+1];
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
