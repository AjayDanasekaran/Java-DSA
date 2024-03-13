package Multithreading;

public class Case1ThreadMain {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread t = new Thread(mt);
		Thread t2 = new Thread();
		t2.start();
		System.err.println("Main Thread");
	}
}
