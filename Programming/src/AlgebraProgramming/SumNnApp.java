package AlgebraProgramming;
//Sum of first 5 natural numbers
//Sum of first n natural numbers
//Sum of natural numbers in a range m,n
import java.util.Scanner;
public class SumNnApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		Sum s = new Sum();
		s.Nn(m,n);
		sc.close();
	}
}
class Sum {
	void Nn(int m,int n) {
		int num = 0;
		for(int i =m;i<=n;i++) {
			num += i;
		}
		System.out.println(num);
	}
}