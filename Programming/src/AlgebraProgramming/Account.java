package AlgebraProgramming;
import java.util.Scanner;
class Account{
	static Scanner sc = new Scanner(System.in);
	static {
		System.out.println("Enter Balance");
	}
	static int balance = sc.nextInt();
	void choice(int choice) {
		if(choice==1) {
			System.out.println("How much do you wish to withdraw?");
			withdrawal(sc.nextInt());
		}
		else if (choice==2){
			display();
		}
		else {
			System.out.println("Invalid Choice");
		}
	}
	void withdrawal(int withdraw) {
		if(balance>=withdraw && balance>500){
			balance  -= withdraw;
			System.out.println("You have succesfully withdrew"+"\nyour balance is : "+balance);
			}
		else{
			System.out.println("This transaction cannot be processed");
		}
	}
	void display() {
		System.out.println("Balance is : "+balance);
	}
	
	public static void main(String arg[]){
	Account a = new Account();
	System.out.println("Enter your choice"+"\n1 : Withdraw"+"\n2. View Balance");
	a.choice(sc.nextInt());
	sc.close();
}
}