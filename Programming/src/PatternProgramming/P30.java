package PatternProgramming;
import java.util.Scanner;
public class P30{
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		for(int i = 1; i<=row;i++) {
			int a =row;
			for(int j =1;j<=col;j++) {
				System.out.print(a--);
			}
			System.out.println();
			
		}
		sc.close();
	}
}
