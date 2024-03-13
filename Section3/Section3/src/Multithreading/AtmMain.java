package Multithreading;

public class AtmMain {
	public static void main(String[] args) {
		Atm atm = new Atm(1000.0);
		System.out.println("Total balance is : "+atm.balance);
		Runnable r1,r2;
		r1 = () -> {atm.withdraw(15000.0);};
		r2 = () -> {atm.deposit(20000.0);};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.setPriority(10);
		t2.start();
		t1.start();
	}
}
 