package PatternProgramming;
import java.util.Scanner;
public class P52 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int row =sc.nextInt();
		char c = 'a';
		int num=1;
		for(int i = 1;i<=row;i++) {
			
			for(int j =1;j<=row*2;j++) {
				if(j%2==1) {
					System.out.print(num+++" ");
				}
				else {
					System.out.print(c+++" ");
				}
			}
			System.out.println();
		}
	}
}
