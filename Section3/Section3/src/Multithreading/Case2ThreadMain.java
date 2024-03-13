package Multithreading;
public class Case2ThreadMain {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread t = new Thread(mt);
		Thread t2 = new Thread();
		t.run();
		System.err.println("Main Thread");
	}
}