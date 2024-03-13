package Multithreading;

public class OddEvenMain {
	public static void main(String[] args) {
		OddEven atm = new OddEven();
		Runnable r1,r2;
		r1 = () -> {atm.printOdd();};
		r2 = () -> {atm.printEven();};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.setPriority(10);
		t2.start();
		t1.start();
	}
}
