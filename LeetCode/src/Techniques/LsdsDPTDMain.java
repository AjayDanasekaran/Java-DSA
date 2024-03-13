package Techniques;

import java.util.Arrays;

public class LsdsDPTDMain {
	static int []memo;
	public static void main(String[] args) {
		int n[] = {5,  3,  9,  7,  8,  6};
		memo = new int[n.length+1];
		Arrays.fill(memo, 0);
		LsdsDPTD(n);
		System.out.println(Arrays.toString(memo));
	}
	public static int LsdsDPTD(int n[]) {
	
	}
}
