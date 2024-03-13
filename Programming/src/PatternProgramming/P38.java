package PatternProgramming;
import java.util.Scanner;
public class P38{
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		char c ='a';
		int num =1;
		for(int i = 1; i<=row;i++) {
			
			for(int j =1;j<=col;j++) {
				if(i==1 || i==row || j==1 || j==col) {
					System.out.print(c++ +" ");
				}
				else {
					System.out.print(num+++" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
