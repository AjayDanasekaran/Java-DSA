package AlgebraProgramming;
//Sum of the digits in a number
//123456 = 1+2+3=6
// % - remainder/ to get last digit
// '/' - quotient / to remove last digit
import java.util.Scanner;
public class SumDigitApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sumdigit s = new sumdigit();
		s.sumdig(num);
	}
}
class sumdigit{
	void sumdig(int num) {
		int digit = 0;
		int sum = 0;
		while(num!=0) {
		digit  = num % 10; //123%10=3, 12%10=2,
		sum = sum+digit;
		num = num/10; //123/10=12, 12/10 = 1, 1/10=0
		}
		System.out.println(sum);
	}
}