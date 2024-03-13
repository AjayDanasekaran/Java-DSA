package Arrays;

public class P1TwoSum {
	public static void main(String[] args) {
		int []nums = {2,7,11,15};
		twoSum(nums,9);
	}
	public static int[] twoSum(int[] nums, int target) {
		int[]two;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    two = {i,j};
                }
            }
        }
        return two;
    }
}
