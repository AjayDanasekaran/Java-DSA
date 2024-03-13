package GFGThread;

class Yield1 implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" under yield");
	}
	
}
public class Yield implements Runnable{

	@Override
	public void run() {
		Thread.yield();
		System.out.println(Thread.currentThread().getName()+" under yield");
	}
	
	public static void main(String[] args) {
		Thread t = new Thread(new Yield(),"FirstThread");
		Thread t1 = new Thread(new Yield1(),"SecondThread");
		t.start();
		t.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t1.setPriority(Thread.MAX_PRIORITY);
	}
}
