package PatternProgramming;
import java.util.Scanner;
public class mulmeth {
	
	static void m1() {
		System.out.println("hi 1");
	}
	void m2() {
		System.out.println("hi 2");
	}
	void m3() {
		System.out.println("hi 3");
	}
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		if(c==1) {
			m1();
		}
	}
}
