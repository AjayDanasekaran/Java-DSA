package Arrays;

import java.util.Arrays;

public class MaxLikeTimeCoefficient {
    	public static void main(String[] args) {
    		int []satisfaction = {2,-2,-3,1};
    		Arrays.sort(satisfaction);
    		System.out.println("Sorted Array : "+Arrays.toString(satisfaction));
    		int sum =0;
            int time=1;
            for(int i=0;i<satisfaction.length;i++){
                if(satisfaction[i]>=-2){
                    sum += satisfaction[i]*(time++);
                    System.out.println("Sum "+i+" : "+sum);
                }
            }
            System.out.println(sum);
		}
}

