package Exception;

public class AioobEH {
	public static void main(String[] args) {
		int a[]  = {3,5,6};
		System.out.println("Program Started");
		try {
			System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("AioobEH Handled");
		}
		finally {
			System.out.println("All Exceptions handled");
		}
		System.out.println("Program Ended");
	}
}
