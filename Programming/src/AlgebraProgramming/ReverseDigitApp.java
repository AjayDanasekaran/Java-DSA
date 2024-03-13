package AlgebraProgramming;
//Reverse of the digits in a number
//123456 = 654321
// % - remainder/ to get last digit
// '/' - quotient / to remove last digit
import java.util.Scanner;
public class ReverseDigitApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		revdigit r = new revdigit();
		r.rdig(num);
	}
}
class revdigit{
	void rdig(int num) {
		int digit = 0;
		int rev = 0;
		while(num!=0) {
		digit  = num % 10; //123456%10=6, 12%10=2,
		rev = rev*10+digit; // 0*10+6=6, 6*10+5=65, 65*10+4=654;
		num = num/10; //123/10=12, 12/10 = 1, 1/10=0
		}
		System.out.println(rev);
	}
}