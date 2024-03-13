package Multithreading;
public class Case4ThreadMain {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread t = new Thread(mt);
		mt.run();
		
		System.err.println("Main Thread");
	}
}