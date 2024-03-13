package PatternProgramming;
import java.util.Scanner;
public class P41{
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		char c ='d';
		for(int i = 1; i<=row;i++) {
			char a = c;
			for(int j =1;j<=col;j++) {
				if(i<=j) {
					System.out.print(a-- +" ");
					}
					else {
						System.out.print(" "+" ");
					}
			}
			System.out.println();
			--c;
		}
		sc.close();
	}
}
