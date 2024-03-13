package PatternProgramming;
import java.util.Scanner;
public class P25{
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		for(int i = 1; i<=row;i++) {
			for(int j =1;j<=col;j++) {
				if(i%2==1) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
