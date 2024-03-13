package GFGThread;

public class RunnableDemo {
	public static void main(String[] args) {
		int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            Thread object= new Thread(new RunnableDemo1());
            object.start();
        }
	}
}
class RunnableDemo1 implements Runnable{

	@Override
	public void run() {
		 try {
	            // Displaying the thread that is running
	            System.out.println(
	               Thread.currentThread().getName()
	                + " is running");
	        }
	        catch (Exception e) {
	            // Throwing an exception
	            System.out.println("Exception is caught");
	        }
	}
}

