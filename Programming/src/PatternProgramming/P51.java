package PatternProgramming;
import java.util.Scanner;
public class P51 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		for(int i = 1; i<=row;i++) {
			int k =i;
			for(int j =1;j<=col;j++) {
				System.out.print(k+" ");
				k=k+4;
			}
			System.out.println();
		}
		sc.close();
	}
}
