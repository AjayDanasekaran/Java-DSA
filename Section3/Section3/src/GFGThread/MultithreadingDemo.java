package GFGThread;
//Thread creation by extending the Thread class
class MultithreadingDemo1 extends Thread {
	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName());
		} catch (Exception e) {
			System.out.println("Ex Caught");
		}
	}
}
public class MultithreadingDemo{
	public static void main(String[] args) {
		int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            MultithreadingDemo1 object= new MultithreadingDemo1();
            object.start();
        }
	}
}
