package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class EqualToZero {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int []nums = {2,2,3,1,1,0};
		int []nums1 = {1,3,1,1};
		int subLen = 0;
		checkArray(nums,3);
	}
	public static void checkArray(int[] nums, int k) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i:nums){
            al.add(i);
        }
        System.out.println(al);
    }
}
