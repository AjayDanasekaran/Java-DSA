package AlgebraProgramming;
//A number is called an Automorphic number if and only if its square ends in the same digits as the number itself.
//Examples : 
// 
//Input  : N = 76 
//Output : Automorphic
//Explanation: As 76*76 = 5776
//
//Input  : N = 25
//Output : Automorphic
//As 25*25 = 625
//1.square the number, 2.take the last digit from both and compare both, 3.if matches return true else false
import java.util.Scanner;
public class AutomorphicApp {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int num = sc.nextInt();
		boolean b = Automorphic(num);
		if(b ==  true)
			System.out.println(num+" : is Automorphic number");
		else
			System.out.println(num+" : is not Automorphic number");
	}
	static boolean Automorphic(int num) {
		int square  = num*num;
		while(num!=0) {
			if(num%10 != square%10) 
			{
				return false; //5 = 25, if 5!5 == return false
			}
			num = num/10;
			square = square/10;
		}
		return true;
	}
}
