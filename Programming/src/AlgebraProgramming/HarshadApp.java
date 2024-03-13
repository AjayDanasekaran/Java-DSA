package AlgebraProgramming;
//a harshad number is a given number that is divisible by the sum of its digits. 
//Below are the first few Harshad Numbers represented;
//1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 18, 20………
// 12 == 1+2 ==3 , 12%3==0 then it is harshad number
// 1. separate the digits 2. sum the digits 3. divide and compare
import java.util.Scanner;
public class HarshadApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); //12
		harshad(num);
	}
	
	static void harshad(int num) {
		int temp = num;
		int digit = 0;
		int sum = 0;
		while(num!=0) {
			digit = num%10;
			sum += digit;
			num = num/10; // num =0;
		}
		if(temp%sum==0) {
			System.out.println(temp+" : is Harshad Number");
		}
		else{
				System.out.println(temp+" : is not Harshad Number");
			}
	}
	
}
