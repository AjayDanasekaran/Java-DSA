package Exception;

public class CcEH extends Object{
	public static void main(String[] args) {
		Object o = new CcEH();
//		CcEH c = (CcEH)o;
		Object obj = "Hello";
		try {
			CcEH c = (CcEH)o;
			Integer num = (Integer) obj;
		}
//		catch(ClassCastException e) {
//			System.out.println("CcEH Handled"+e.getMessage());
//		}
		finally {
			System.out.println("All Exceptions handled");
		}
		System.out.println("Program Ended");
	}
}
