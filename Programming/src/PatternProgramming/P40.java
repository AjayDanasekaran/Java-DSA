package PatternProgramming;
import java.util.Scanner;
public class P40{
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int num =0;
		for(int i = 1; i<=row;i++) {
			num=num+i;
			int a = num;
			for(int j =1;j<=col;j++) {
				if(i>=j) {
					System.out.print(a-- +" ");
					}
					else {
						System.out.print(" ");
					}
			}
			System.out.println();
		}
		sc.close();
	}
}
