package Multithreading;

public class Atm {
	double balance;
	Atm(double balance){
		this.balance+=balance;
	}
	public static void pleasewait() {
		for(int i=0;i<4;i++) {
			try {
			Thread.sleep(1500);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		System.out.print(".");
		}
		
	}
	public synchronized void withdraw(double amount) {
		System.out.println("Amount dispensing please wait");
		pleasewait();
		System.out.println();
		if(amount>balance) {
			System.out.println("Not enough balance!");
			try {
				this.wait(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance-=amount;
		System.out.println("Amount dispensed sucessfully, Updated balance is :"+balance);
		System.out.println();
	}
	public synchronized void deposit(double amount) {
		System.out.println("Amount deposting please wait");
		pleasewait();
		this.balance+=amount;
		System.out.println("Deposited sucessfully, updated balance is :"+balance);
		System.out.println();
		this.notify();
	}
}
