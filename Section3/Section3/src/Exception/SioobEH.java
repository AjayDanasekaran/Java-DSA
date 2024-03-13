package Exception;

public class SioobEH {
	public static void main(String[] args) {
		String s = "abcd";
		System.out.println("Program Started");
		try {
			System.out.println(s.charAt(10));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("SioobEH Handled");
		}
		finally {
			System.out.println("All Exceptions handled");
		}
		System.out.println("Program Ended");
	}
}
