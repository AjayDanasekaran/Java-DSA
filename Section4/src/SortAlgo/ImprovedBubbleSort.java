package SortAlgo;

import java.util.Arrays;

public class ImprovedBubbleSort {
	public static void main(String[] args) {
		int[] arr= {1,4,6,8,2,5,3,0,7};
		for(int i=0;i<arr.length;i++) {
			boolean sorted=true;
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					arr[j]=arr[j]^arr[j+1];
					arr[j+1]=arr[j]^arr[j+1];
					arr[j]=arr[j]^arr[j+1];
					sorted=false;
				}
			}
			if(sorted) {
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
