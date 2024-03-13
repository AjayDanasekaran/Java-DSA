package PatternProgramming;
import java.util.Scanner;
public class P48{
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int space = row/2;
		int star = 1;
		int a = 1;
		for(int i = 1;i<=row;i++) {
			for(int j = 1 ; j<=space;j++) {
				System.out.print(" "+" ");
			}
			for(int k=1 ; k<=star;k++) {
				System.out.print(a+++" ");
				if(a==2) {
					a=0;
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
