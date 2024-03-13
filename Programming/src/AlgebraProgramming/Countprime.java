package AlgebraProgramming;
// any number that is divisible by itself and 1
// two positive divisors
// from range m to n
import java.util.Scanner;
class Cprime{
	int checkPrime(int a) {
		int count=0;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				count++;
			}
		}
		return count;
	}
}
public class Countprime{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		Cprime p= new Cprime();
		int count=0;
		for(int i=m;i<=n;i++) {
			int c = p.checkPrime(i);
			if(c==2) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}