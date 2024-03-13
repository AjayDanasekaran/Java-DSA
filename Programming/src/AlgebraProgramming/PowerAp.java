package AlgebraProgramming;
// 2^3 = 2*2*2 = 8
// base = 2 , power/exponent = 3 
import java.util.Scanner;
public class PowerAp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		int exp = sc.nextInt();
		Powera a = new Powera();
		a.powerton(base, exp);
//		System.out.println(n);
//		int power=1;
//		
//		for(int i=1;i<=exp;i++) {
//			power=power*base;
//		}
//		System.out.println(power);
	}
}		
		
class Powera{
	void powerton(int base,int exp) {
			int finalpower = 1;
			for(int i =1;i<=exp;i++) { //for loop doesn't work
				finalpower = finalpower * base; //2 , 2*2, 4*2  
			}
			System.out.println(finalpower);
//			return power;
	}
}
