package PatternProgramming;
import java.util.Scanner;
public class Arithmetic {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter 1 for Addition"+"\n"+"Enter 2 for Subtraction"+"\n"+"Enter 3 for Multiplication"+"\n"+"Enter 4 for Division");
	int choice = s.nextInt();
	if( choice == 1) {
		System.out.println("Enter two numbers");
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println(Add(a,b));
		
	}
	else if( choice ==2) {
		System.out.println("Enter two numbers");
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println(Sub(a,b));
	}
	else if( choice ==3) {
		System.out.println("Enter two numbers");
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println(Mul(a,b));
	}
	else {
		System.out.println("Enter two numbers");
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println(Div(a,b));
	}
	}
	static int Add(int a,int b){
		return a+b;
	}
	static int Sub(int a,int b){
		return a-b;
	}
	static int Mul(int a,int b){
		return a*b;
	}
	static int Div(int a,int b){
		return a/b;
	}
}