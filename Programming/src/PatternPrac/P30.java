package PatternPrac;
import java.util.Scanner;
public class P30{
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		for(int i = 1; i<=row;i++) {
			for(int j =5;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		sc.close();
	}
}
