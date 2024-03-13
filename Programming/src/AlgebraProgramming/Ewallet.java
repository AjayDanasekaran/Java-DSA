package AlgebraProgramming;
import java.util.Scanner;
class Ewallet{
	static Scanner sc = new Scanner(System.in);
	static {
		System.out.println("Enter Balance");
	}
	static int balance = sc.nextInt();
	void choicee(int choice) {
		if(choice==1) {
			System.out.println("How much do you wish to deposit?");
			int amount = sc.nextInt();
			addMoney(amount);
			sc.close();
		}
		else if(choice ==2) {
			System.out.println("Purchase amount ?");
			int amount = sc.nextInt();
			purchase(amount);
			sc.close();
		}
		else if(choice==3) {
			display();
		}
		else {
			System.out.println("Invalid Choice");
		}
	}
	void addMoney(int amount) {
		balance += amount;
		System.out.println("Balance is : "+balance);
	}
	void purchase(int amount) {
		if(balance>=amount){
		balance -= amount;
		System.out.println("Purchase Complete"+"\nBalance is : "+balance);
		}
		else {
			System.out.println("Purchase Incomplete"+"\nBalance is lesser than purchase amount : "+balance);
		}
	}
	void display() {
		System.out.println("Balance is : "+balance);
	}
	public static void main(String args[]){
		System.out.println("Enter your choice"+"\n1 : Add Money to Ewallet"+"\n2 : Purchase"+"\n3. View Balance");
		int choice = sc.nextInt();
		Ewallet e = new Ewallet();
		e.choicee(choice);
	}
}