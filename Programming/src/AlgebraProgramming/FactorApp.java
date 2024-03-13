package AlgebraProgramming;
//A factor of a number is a number that divides the given number evenly or exactly, leaving no remainder.
//The number 10 has 4 factors, such as 1, 2, 5 and 10.
import java.util.Scanner;
public class FactorApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean b = factor(num);
		if(b == true)
			System.out.println(num+" is a factor of 10");
		else
			System.out.println(num+" is not a factor of 10");
	}
	static boolean factor(int num) {
		if(10%num==0) {
			return true;
		}
		return false;
	}
}
