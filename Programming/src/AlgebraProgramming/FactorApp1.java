package AlgebraProgramming;
//A factor of a number is a number that divides the given number evenly or exactly, leaving no remainder.
//find the factors of a given number
import java.util.Scanner;
public class FactorApp1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		factor(num);
		sc.close();
	}
	static void factor(int num) {
		for(int i =1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i+" : is a factor of "+num);
			}
		}
	}
}
