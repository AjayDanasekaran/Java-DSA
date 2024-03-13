package PatternPrac;
import java.util.Scanner;
public class P39 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int row=sc.nextInt();
		int col = row*2-1;
		for(int i =1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				if(i==j || j==col+1-i) {
					System.out.print("*"+" ");
				}
			}
			System.out.println();
		}
	}
}
