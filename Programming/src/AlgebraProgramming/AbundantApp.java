package AlgebraProgramming;
//A number said to be an Abundant Number if the sum of all the proper divisors of the number is greater than the value of the number.
//The integer 12 is the first abundant number.
//Its proper divisors are 1, 2, 3, 4 and 6 for a total of 16. 
//The amount by which the sum exceeds the number is the abundance.
// first 22 abundant numbers: 12, 18, 20, 24, 30, 36, 40, 42, 48, 54, 56, 60, 66, 70, 72, 78, 80, 84, 88, 90, 96, 100.
// sum of the factors> given number == abundant number
// 1. find factors 2. sum the factors 3. compare sum with given number 4. if sum>number == abundant number else not
import java.util.Scanner;
public class AbundantApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		abundant(num);
	}
	static void abundant(int num) {
		int sum = 0;
		
		//sum of the factors
		for(int i=1;i<num;i++) {
			if(num%i==0) 
			{
				sum = sum + i;
			}
		}
		
		//compare
		if(sum>num)
			System.out.println(num+" : is Abundant Number");
		else
			System.out.println(num+" : is not Abundant Number");
	}
}
