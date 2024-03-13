package Exception;

public class Case1 {
	public static void main(String[] args) {
		System.out.println("Statement 1");
		int a = 40;
		int b = 20;
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot divide by 0");
		}
		System.out.println("Statement 2");
	}
}
