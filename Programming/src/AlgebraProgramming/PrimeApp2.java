package AlgebraProgramming;
import java.util.Scanner;
class Primenum{
	boolean checkPrime(int a) {
		if(a == 1 || a==0) {
			return false;
		}
		else if(a == 2) {
			return true;
		}
		else {
			for(int i=2;i<a;i++) {
				if(a%i==0) {
					return false;
				}
			}
			return true;
		}
	}
}
public class PrimeApp2{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Primenum p = new Primenum();
		boolean c = p.checkPrime(num);
		if(c==true) {
			System.out.println(num+" : Is a Prime Number");
		}
		else {
			System.out.println(num+" : Is not a Prime Number");
		}
		sc.close();
	}
}
