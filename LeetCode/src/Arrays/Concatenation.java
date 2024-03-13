package Arrays;

import java.util.Arrays;

public class Concatenation {
	public static void main(String[] args) {
		int []nums = {1,2,1};
		int n=nums.length;
        int []ans = new int[n*2];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[ans.length/2+i]=nums[i];
        }
        System.out.println(Arrays.toString(ans) );
	}
}
