package Exception;

public class Case3 {
	public static void main(String[] args) {
		System.out.println("Statement 1");
		int a = 40;
		int b = 0;
		try {
			System.out.println(a/b);
		}
		catch(Throwable e) {
			System.out.println("Cannot divide by 0");
		}
		System.out.println("Statement 2");
	}
}
