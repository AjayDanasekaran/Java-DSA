//one Sub class acquiring properties from a Super class
public class SInheritance {
	public static void main(String[] args) {
		Mom m = new Mom();
		m.intro1();
		System.out.println(m.balance1);
		m.vehicle();
		System.out.println(m.balance);
	}
}
class Dad{
	int balance  = 1000;
	void vehicle() {
		System.out.println("I have a CAR");
	}
}
class Mom extends Dad{
	int balance1 = 10000;
	void intro1() {
		System.out.println("I AM MOM");
	}
}