package PatternProgramming;
import java.util.Scanner;
public class P23{
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int space = 0;
		int star = row*2-1;
		for(int i = 1; i<=row;i++) {
			for(int j =1;j<=space;j++) {
				System.out.print(" "+" ");
			}
			for(int k=1;k<=star;k++) {
				System.out.print("*"+" ");
			}
			System.out.println();
			space++;
			star-=2;
		}
		sc.close();
	}
}
