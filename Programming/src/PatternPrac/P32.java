package PatternPrac;
import java.util.Scanner;
public class P32{
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		for(int i = 1; i<=row;i++) {
			int num = 1;
			for(int j =1;j<=col;j++) {
				if(i>=j)
				System.out.print(num++);
			}
			System.out.println();
		}
		sc.close();
	}
}
