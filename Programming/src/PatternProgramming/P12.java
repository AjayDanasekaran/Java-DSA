package PatternProgramming;
import java.util.Scanner;
public class P12 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		for(int i = 1; i<=row;i++) {
			for(int j =1;j<=col;j++) {
				if( i == (row+1)/2 || j == (col+1)/2 || (j==1 && i<=(row+1)/2) || (j==col && i>=(row+1)/2) || (i==1 && j>=(col+1)/2) || (i==row && j<=(col+1)/2)) {
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
