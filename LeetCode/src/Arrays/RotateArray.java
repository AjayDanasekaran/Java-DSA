package Arrays;

import java.util.Arrays;

public class RotateArray {
	public static void main(String[] args) {
		int []nums = {1,2,3,4,5,6,7};
		int k=3;
		int n=nums.length;
        int rot[] = new int[n];
        int a=n-k-1;
        for(int i=n-1;i>=n-k;i--){
            rot[a--]=nums[i];
        }
        for(int i=0;i<n-k;i++){
            rot[a++]=nums[i];
        }
        System.arraycopy(rot, 0, nums, 0, n);
        System.out.println(Arrays.toString(nums));
	}
}
