package AlgebraProgramming;
//a perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself.
//6 has divisors 1, 2 and 3, and 1 + 2 + 3 = 6, so 6 is a perfect number.
//There are only 2 perfect numbers from 1 to 100 which are 6 and 28.
import java.util.Scanner;
public class PerfectNumApp {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int num = sc.nextInt(); //10
		int fact = factor(num); //8
		checkPerfect(num,fact);
		sc.close();
	}
	static int factor(int num) {
		int sum=0;
		for(int i =1;i<num;i++) {
			if(num%i==0) {
				sum = sum +i; //1,2,5 == 8
			}
		}
		return sum; //8
	}
	static void checkPerfect(int m,int n) {
		if(m==n) {
			System.out.println(m+": is a perfect number");
		}
		else
			System.out.println(m+": is not a perfect number");
	}
}
