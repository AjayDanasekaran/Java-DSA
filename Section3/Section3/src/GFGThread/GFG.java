package GFGThread;

//Java program to demonstrate that a Child thread
//Getting Same Priority as Parent thread

//Importing all classes from java.lang package
import java.lang.*;

//Main class
//ThreadDemo
//Extending Thread class
class GFG extends Thread {

	// Method 1
	// run() method for the thread that is
	// invoked as threads are started
	public void run()
	{
		// Print statement
		System.out.println("Inside run method");
	}

	// Method 2
	// Main driver method
	public static void main(String[] args)
	{
		// main thread priority is set to 6 now
		Thread.currentThread().setPriority(6);

		// Current thread is accessed
		// using currentThread() method

		// Print and display main thread priority
		// using getPriority() method of Thread class
		System.out.println(
			"main thread priority : "
			+ Thread.currentThread().getPriority());

		// Creating a thread by creating object inside
		// main()
		GFG t1 = new GFG();

		// t1 thread is child of main thread
		// so t1 thread will also have priority 6

		// Print and display priority of current thread
		System.out.println("t1 thread priority : "
						+ t1.getPriority());
	}
}
