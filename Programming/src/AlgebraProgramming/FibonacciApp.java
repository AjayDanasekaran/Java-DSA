package AlgebraProgramming;
//a series of numbers in which each number (Fibonacci number ) is the sum of the two preceding numbers. The simplest is the series 0,1, 1, 2, 3, 5, 8
//print n fibonacci numbers
import java.util.Scanner;
public class FibonacciApp {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	fibonacci(n);
}

	static void fibonacci(int n) {
		int num1 = 0;
		int num2 = 1;
		if(n == 1) {
			System.out.println(num1);
		}
		else if(n==2) {
			System.out.println(num1+" ,"+num2);
		}
		else {
			System.out.print(num1+" ,"+num2+" ,");
			for(int i =3;i<=n;i++) {
				int fib = num1+num2;
				if(i!=n) {
				System.out.print(" "+fib+" ,");
				}
				else {
					System.out.print(fib);
				}
				num1 = num2;
				num2 = fib;
			}
		}
	}
}
