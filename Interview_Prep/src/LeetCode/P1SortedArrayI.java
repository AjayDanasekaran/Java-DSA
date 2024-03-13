package LeetCode;

import java.util.Arrays;

public class P1SortedArrayI {
	public static void main(String[] args) {
		int testCase1[] = {1,1,2};
		int testCase2[] = {0,0,1,1,1,2,2,3,3,4};
//		streamRemove(testCase2);
//		twoPointer(testCase2);
		godly(testCase2);
	}
	public static void twoPointer(int []arr) {
		int j = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
            	arr[j] = arr[i];
                j++;
            }
        }
        System.out.println(j);
        System.out.println(Arrays.toString(arr));
	}
	public static void streamRemove(int []arr) {
		int[] expectedNums = Arrays.stream(arr).distinct().toArray();
		System.arraycopy(expectedNums, 0, arr, 0, expectedNums.length);
//	    Arrays.sort(arr);
	    System.out.println(Arrays.toString(arr));;
	    int k = expectedNums.length;
	    System.out.println(k);
	}
	public static void godly(int arr[]) {
		int i=0;
		for(int n:arr) {
			if(i<1 || n>arr[i-1]) {
				arr[i++]=n;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
