package PatternProgramming;
import java.util.Scanner;
public class P7 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = row*2-1;
		for(int i = 1; i<=col;i++) {
			for(int j =1;j<=col;j++) {
				if(i==j || j==col-i+1 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
