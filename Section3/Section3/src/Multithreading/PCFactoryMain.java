package Multithreading;

public class PCFactoryMain {
	public static void main(String[] args) {
		PCFactory pc = new PCFactory();
		Runnable r1,r2;
		r1 = () -> {pc.produce();};
		r2 = () -> {pc.consume();};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.setPriority(10);
		t1.start();
		t2.start();
	}
}
