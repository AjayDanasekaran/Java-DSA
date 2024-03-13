package PatternProgramming;
import java.util.Scanner;
public class P33{
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int a =1;
		for(int i = 1; i<=row;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print(a++ +" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
