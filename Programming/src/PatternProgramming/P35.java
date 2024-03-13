package PatternProgramming;
import java.util.Scanner;
public class P35{
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		char c ='A';
		int a = 1;
		for(int i = 1; i<=row;i++) {
			for(int j =1;j<=col;j++) {
				if(i==1 || i ==row || j==1 || j==col) {
					System.out.print(a++ +" ");
					}
				else {
					System.out.print(c++ +" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
