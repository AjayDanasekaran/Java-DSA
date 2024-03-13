package Exception;

public class AEH {
	public static void main(String[] args) {
		try {
		math();
		}
		catch(ArithmeticException a) {
			System.out.println("aie handled");
		}
	}
	public static void math() throws ArithmeticException{
		int a = 33;
		int b = 0;
		System.out.println("Program Started");
		System.out.println(a/b);
		System.out.println("Program Ended");
	}
}
//int a = 33;
//int b = 0;
//System.out.println("Program Started");
//try {
//	System.out.println(a/b);
//}
//catch(ArithmeticException e) {
//	System.out.println("AEH Handled");
//}
//finally {
//	System.out.println("All Exceptions handled");
//}
//System.out.println("Program Ended");
