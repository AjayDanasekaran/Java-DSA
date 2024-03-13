package Exception;

public class Case2 {
	public static void main(String[] args) {
		System.out.println("Statement 1");
		int a = 10;
		int b = 0;
		try {
			System.out.println(a/b);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Cannot divide by 0");
		}
		System.out.println("Statement 2");
	}
}

