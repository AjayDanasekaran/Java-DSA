package PatternPrac;
import java.util.Scanner;
public class P34{
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		char c= 'a';
		for(int i = 1; i<=row;i++) {
			for(int j =1;j<=col;j++) {
				System.out.print(c++);
			}
			System.out.println();
		}
		sc.close();
	}
}
