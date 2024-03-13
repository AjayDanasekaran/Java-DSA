package PatternProgramming;
import java.util.Scanner;
public class P32{
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();	
		for(int i = 1; i<=row;i++) {
			int a = 1;
			for(int j =1;j<=i;j++) {
				System.out.print(a++);
			}
			System.out.println();
		}
		sc.close();
	}
}
