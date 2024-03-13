package SearchingAlgo;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr= {1,4,6,8,2,5,3,0};
		int target=5;
		Arrays.sort(arr);
		int low=0,top=arr.length-1;
		while(low<=top) {
			int mid=(low+top)/2;
			int midValue = arr[mid];
			if(midValue==target) {
				System.out.println("Element Found at "+mid);
				break;
			}
			else if(midValue<target) {
				low=mid+1;
			}
			else {
				top=mid-1;
			}
		}
	}
}
