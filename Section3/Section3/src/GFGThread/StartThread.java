package GFGThread;

public class StartThread implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Is Running");
		
	}
	public static void main(String[] args) {
		Thread t1 = new Thread(new StartThread(),"FirstThread");
		t1.start();
	}
}
