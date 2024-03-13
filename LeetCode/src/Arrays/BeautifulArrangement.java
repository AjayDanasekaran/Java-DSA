package Arrays;

import java.util.Arrays;

public class BeautifulArrangement {
	public static void main(String[] args) {
		constructArray(3,1);
	}
	public static void constructArray(int n, int k) {
        int[] arr = new int[n];
        int[] disInt=new int[arr.length];
        int count=0;
        for(int i=0;i<arr.length;i++){
                arr[i]=i+k;
        }
        for(int i=1;i<arr.length;i++) {
        	disInt[i]=arr[i]-arr[i-1];
        }
        System.out.println(Arrays.toString(disInt));
        System.out.println(Arrays.toString(arr));
    }
}
