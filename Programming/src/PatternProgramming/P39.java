package PatternProgramming;
import java.util.Scanner;
public class P39{
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		
		for(int i = 1; i<=row;i++) {
			char c ='a';
			int num =1;
			for(int j =1;j<=col;j++) {
				if(i>=j) {
					if(i%2==1) {
					System.out.print(num++ +" ");
					}
					else {
						System.out.print(c+++" ");
					}
			}
			}
			System.out.println();
		}
		sc.close();
	}
}
