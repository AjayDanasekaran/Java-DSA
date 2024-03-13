package AlgebraProgramming;
//Palindrome = when number remains same even when it is reversed
//191 = 191 , 202 = 202 , 1223 = 3221
// % - remainder/ to get last digit
// '/' - quotient / to remove last digit
import java.util.Scanner;
public class PalindromeApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Palindrome r = new Palindrome();
		int reverse = r.rdig(num);
		if(num==reverse) {
			System.out.println(num+" It is a palindrome number");
		}
		else {
			System.out.println(num+" It is not a palindrome number");
		}
	}
}

class Palindrome{
	int rdig(int num) {
		int digit = 0;
		int rev = 0;
		while(num!=0) {
		digit  = num % 10; //123456%10=6, 12%10=2,
		rev = rev*10+digit; // 0*10+6=6, 6*10+5=65, 65*10+4=654;
		num = num/10; //123/10=12, 12/10 = 1, 1/10=0
		}
		return rev;
	}
}