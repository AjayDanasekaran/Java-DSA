package Exception;

public class FinallyExample {
	public static void main(String[] args) {
		System.out.println("Statement 1");
		int a = 40;
		int b = 0;
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot divide by 0");
		}
		catch(Exception e) {
			System.out.println("EH");
		}
		catch(Throwable e) {
			System.out.println("th");
		}
		finally {
			System.out.println("Always Executes");
		}
		System.out.println("Statement 2");
	}
}

