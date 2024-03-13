package PatternProgramming;
import java.util.Scanner;
public class P29{
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		for(int i = row; i>=1;i--) {
			for(int j =1;j<=col;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		sc.close();
	}
}
