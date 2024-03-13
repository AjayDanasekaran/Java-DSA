package PatternProgramming;
import java.util.Scanner;
public class P9v2 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = row*2-1;
		for(int i = 1; i<=col;i++) {
			for(int j =1;j<=col;j++) {
				if(i==1 || j==1 || i==col || j ==col ) {
					System.out.print("*");
				}
				else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
