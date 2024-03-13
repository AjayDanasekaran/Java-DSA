package AlgebraProgramming;
// any number that is divisible by itself and 1
// two positive divisors

import java.util.Scanner;
class Prime{
	int checkPrime(int a) { //13
		int count=0;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				count++;
			}
		}
		return count;
	}
}
public class PrimeApp{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Prime p = new Prime();
		int c = p.checkPrime(num);
		if(c==2) {
			System.out.println(num+" : Is a Prime Number");
		}
		else {
			System.out.println(num+" : Is not a Prime Number");
		}
		sc.close();
	}
}
