package Exception;

public class NPEH {
	public static void main(String[] args) {
		String s=null;
		try {
			System.out.println(s.length());
		}
		catch(NullPointerException e) {
			System.out.println("NPE Handled");
		}
		finally {
			System.out.println("All Exceptions handled");
		}
		System.out.println("Program Ended");
	}
}
