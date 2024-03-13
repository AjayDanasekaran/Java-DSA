package Techniques;

import java.util.Arrays;

public class FactorialDPTDMain {
	static int []memo;
	public static void main(String[] args) {
		int n=5;
		memo = new int[n+1];
		Arrays.fill(memo, -1);
		memo[0]=1;
	    FactorialDPTD(n);
		System.out.println(Arrays.toString(memo));
	}
	public static int FactorialDPTD(int n) {
		if(n==0) {
			return 1;
		}
		if(memo[n]!=-1) {
			return memo[n];
		}
		memo[n] = n* FactorialDPTD(n-1);
		return memo[n];
	}
}
