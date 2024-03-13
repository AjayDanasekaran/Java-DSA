package PatternProgramming;
import java.util.Scanner;
public class P16 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		for(int i = 1; i<=row;i++) {
			for(int j =1;j<=col;j++) {
				if(j>=i) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
