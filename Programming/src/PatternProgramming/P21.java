package PatternProgramming;
import java.util.Scanner;
public class P21{
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = row*2-1;
		for(int i = 1; i<=row;i++) {
			for(int j =1;j<=col;j++) {
				if(i == row || i+j==row+1 || j-i==row-1) {
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
