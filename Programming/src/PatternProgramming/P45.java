package PatternProgramming;
import java.util.Scanner;
public class P45{
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int space= row-1;
		int star=1;
		int num=1;
		for(int i = 1; i<=row;i++) {
			char c = 'a';
			for(int j =1;j<=space;j++) {
				System.out.print(" "+" ");
			}
			for(int k =1;k<=star;k++) {
				if(k==1 ||k==star) {
				System.out.print(num+++" ");}
				else {
					System.out.print(c+++" ");
				}
			}
			System.out.println();
			space--;
			star+=2;
		}
		sc.close();
	}
}
