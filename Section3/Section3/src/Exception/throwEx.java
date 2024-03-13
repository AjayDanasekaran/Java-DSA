package Exception;

public class throwEx {
	public static void main(String[] args) {
		System.out.println("Program Started");
		try {
			throw new InterruptedException();
//			throw new ArithmeticException();
		}
		catch(InterruptedException e) {
			System.out.println("IEH Handled "+e.getMessage());
		}
//		catch(ArithmeticException e) {
//			System.out.println("IEH Handled "+e.getMessage());
//		}
		finally {
			System.out.println("All Exceptions handled");
		}
		System.out.println("Program Ended");
	}
}
