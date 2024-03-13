package PatternProgramming;
import java.util.Scanner;
public class P42{
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
//		int row = sc.nextInt();
//		int space= row-1;
//		int star=1;
//		for(int i = 1; i<=row;i++) {
//			for(int j =1;j<=space;j++) {
//				System.out.print(" "+" ");
//			}
//			for(int k =1;k<=star;k++) {
//				System.out.print(k+" ");
//			}
//			System.out.println();
//			space--;
//			star+=2;
//		}
//		sc.close();
		int n =4;
		char ch='d';
		int star=n;
		
		for(int i=n;i>=1;i--) {
			char cc=ch;
			for(int j=1;j<=i;j++) {
				System.out.print(cc-- +" ");
			}
		System.out.println();
		star--;
		ch--;
		
		
	}}
}
