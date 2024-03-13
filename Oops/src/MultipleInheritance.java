
public class MultipleInheritance {
	public static void main(String[] args) {
	Sub1 s=  new Sub1();
	s.m1();
	s.m2();
	}
}
interface SuperB extends Object{
	public void m1() {
	System.out.println("In SUPERA CLASS");
	}
}
interface SuperC extends Object{
	public void m1() {
	System.out.println("In SUPERB CLASS");
	}
}
class SubD extends SuperA,SuperB
{
	public void m2() {
	System.out.println("In SUB CLASS");
	}
}