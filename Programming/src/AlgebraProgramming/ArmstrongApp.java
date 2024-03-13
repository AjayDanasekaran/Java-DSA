package AlgebraProgramming;
// 153 = 1^3 + 5^3 + 3^3 = 153
// 1634 = 1^4 + 6^4 + 3^4 + 4^4 = 1634
//method
//count num of digits <>
//raise to the power
//sum
//compare user value and final value
import java.util.Scanner;
public class ArmstrongApp {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
//		int num = sc.nextInt();
		int m = sc.nextInt();
		int n = sc.nextInt();
		for(int i =m;i<=n;i++) {
			int counter = getCount(i);
			int  finalsum = getSum(i,counter);
			if(i == finalsum) {
				System.out.println(i+" Is Armstrong number");
			}
		}
	}
	
	static int getCount(int num) {
		int count=0;
		while(num!=0) {
		count++;
		num = num/10;
		}
		return count;
	}
	
	static int getSum(int num,int n) {
		int sum=0;
		int digit = 0;
		while(num!=0) {
			digit  = num % 10;
			int power = 1;
			for(int i =1;i<=n;i++) { //for loop doesn't work
				power = power * digit; //2 , 2*2, 4*2  
			}
			sum = sum+power;
			num = num/10;
		}
		return sum;
	}
}
