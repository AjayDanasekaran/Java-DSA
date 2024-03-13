package AlgebraProgramming;
import java.util.Scanner;
public class PrimeApp1 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		if(a == 1 || a==0) {
			System.out.println(a+" is not prime number");
		}
		else if(a == 2) {
			System.out.println(a+" is prime number");
		}
		else {
			for(int i=2;i<a;i++) {
				if(a%i==0) {
					System.out.println(a+" is not prime number");
					System.exit(0);
				}
			}
			System.out.println(a+" is prime number");
		}
	}
}
