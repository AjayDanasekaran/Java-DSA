package AlgebraProgramming;
// given number is strong number or not
//Strong number is a special number whose sum of the factorial of digits is equal to the original number.
//For Example: 145 is strong number. Since, 1! + 4! + 5! = 1 + 24 + 120 = 145.
// 1. separate the digits 2.find factorial 3.find sum of individual factorial sum 4.compare with given number
//A strong number is one in which the factorial of the digits equals the number itself. 1, 2, 145, and 40585
import java.util.Scanner;
public class StrongApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
		for(int i =1;i<=50000;i++) {
			int strongsum = getSum(i);
				if(i==strongsum) {
					System.out.println(i+" is a strong number");
				}
			}
	}	
	static int getSum(int num) {
		int sum=0;
		int digit = 0;
		while(num!=0) {
			digit  = num % 10;
			sum = sum + factorial(digit);
			num = num/10;
		}
		return sum;
	}
	
	static int factorial(int n) {
		int fact = 1;
		for(int i = 1;i<=n;i++) {
			fact = fact * i; //1*1=1 , 1*2=2 , 2*3=6, 6*4=24, 24*5=120
		}
		return fact;
	}
}
