package Multithreading;

public class ThreadMain {
	public static void main(String[] args) throws InterruptedException {
		MyThread mt = new MyThread();
		Thread t = new Thread(mt);
//		t.sleep(200);
		t.start();
		System.err.println("Main Thread");
	}
}
