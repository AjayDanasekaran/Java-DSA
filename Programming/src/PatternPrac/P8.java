package PatternPrac;
import java.util.Scanner;
public class P8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		for(int i = 1; i<=row;i++) {
			for(int j =1;j<=col;j++) {
				if(i+j==row+1 || i==j) {
					System.out.print("#"+" ");
				}
				else {
					System.out.print("*"+" ");
				}
		}
			System.out.println();
		}	
	}
}

