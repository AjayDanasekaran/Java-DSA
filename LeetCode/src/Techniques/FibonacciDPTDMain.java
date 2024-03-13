package Techniques;

import java.util.Arrays;

public class FibonacciDPTDMain {
	static int []memo;
	public static void main(String[] args) {
		int n=10;
		memo = new int[n+1];
		Arrays.fill(memo, -1);
		memo[0] = 0;
	    memo[1] = 1;
		FibonacciDPTD(n);
		System.out.println(Arrays.toString(memo));
	}
	public static int FibonacciDPTD(int n) {
		if(n<=1) {
			return n;
		}
		if(memo[n]!=-1) {
			return memo[n];
		}
		memo[n] = FibonacciDPTD(n-1)+FibonacciDPTD(n-2);
		return memo[n];
	}
}
