package PatternPrac;
import java.util.Scanner;
public class P35{
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int num = 1;
		char c= 'A';
		for(int i = 1; i<=row;i++) {
			for(int j =1;j<=col;j++) {
				if(i==1 || j==1 || j==col || i==row) {
					System.out.print(num+++" ");}
				else {
					System.out.print(c+++" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
