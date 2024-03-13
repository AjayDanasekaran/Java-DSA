package Exception;

abstract class UpEx {
//	public abstract void m3();
	public void m1() {};
	public void m2() {
		System.out.println("hi");
	}
}
class Upcasting extends UpEx{
	@Override
	public void m1() {
		System.out.println("Hello");
	};
	@Override
	public void m2() {
		System.out.println("hiiii");
	}
	public void m3() {
		System.out.println("sahana");
	}
}
public class DownExMain{
	public static void main(String[] args) {
		UpEx dee = new Upcasting();
		dee.m1();
		dee.m2();
//		dee.m3();
		Upcasting u = (Upcasting)dee;
		u.m1();
		u.m2();
		u.m3();
	}
}

