package PatternProgramming;
import java.util.Scanner;
public class P44{
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int space= row-1;
		int star=1;
		int num=1;
		char c = 'a';
		for(int i = 1; i<=row;i++) {
			for(int j =1;j<=space;j++) {
				System.out.print(" "+" ");
			}
			for(int k =1;k<=star;k++) {
				if(k%2==1) {
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
