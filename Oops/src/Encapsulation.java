import java.util.Scanner;

public class Encapsulation{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Pin");
		int p = sc.nextInt();
		User e = new User();
		e.setamt(p, 100000);
		int b = e.getamt(p);
		System.out.println(b);
		sc.close();
	}
}

class User {
	private int amt = 10000;
	private int pin = 1234;
	public void setamt(int pin,int amt) {
		if(this.pin==pin) {
			this.amt = amt;
		}
		else {
			System.out.println("Pin is incorrect");
			System.exit(0);
		}
	}
	public int getamt(int p) {
		if(pin!=p) {
			System.out.println("Pin is incorrect");
			System.exit(0);
		}
		return amt;
	}
}
