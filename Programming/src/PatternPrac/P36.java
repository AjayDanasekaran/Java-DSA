package PatternPrac;
import java.util.Scanner;
public class P36{
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		for(int i = 1; i<=row;i++) {
			int num = 65;
			char c = (char) num;
			for(int j =1;j<=col;j++) {
				if(i>=j)
				System.out.print(c++);
			}
			System.out.println();
		}
		sc.close();
	}
}
