package Multithreading;
public class Case3ThreadMain {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread t = new Thread(mt);
//		mt.start();
		
		System.err.println("Main Thread");
	}
}