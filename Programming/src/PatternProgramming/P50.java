package PatternProgramming;
import java.util.Scanner;
public class P50{
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int space = row/2;
		int star = 1;
		int a = 1;
		char c = 'a';
		for(int i = 1;i<=row;i++) {
			for(int j = 1 ; j<=space;j++) {
				System.out.print(" "+" ");
			}
			for(int k=1 ; k<=star;k++) {
				if(k==1 || k==star) {
					System.out.print("*"+" ");
				}
				else if(i<=(row+1)/2) {
					System.out.print(a+++" ");
				}
				else{
					System.out.print(c+++" ");
				}
			}
			System.out.println();
			if(i<(row+1)/2) {
				space--;
				star+=2;
			}
			else{
				space++;
				star-=2;
			}
		}
	}
}
