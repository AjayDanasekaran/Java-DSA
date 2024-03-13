package PatternPrac;
import java.util.Scanner;
public class P7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = row*2+1;
		for(int i = 1; i<=col;i++) {
			for(int j =1;j<=col;j++) {
				if((j==col+1-i || i==j)) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print(" "+" ");
				}
		}
			System.out.println();
		}	
	}
}
