package Exception;

public class IEH {
	public static void main(String[] args) {
		Thread t = new Thread();
		System.out.println("Program Started");
		try {
			m1(t);
		}
		catch(InterruptedException e) {
			System.out.println("IEH Handled"+e.getMessage());
		}
		finally {
			System.out.println("All Exceptions handled");
		}
		System.out.println("Program Ended");
	}
	public static void m1(Thread t) throws InterruptedException {
		Thread.sleep(1000);
		t.interrupt();
	}
}
