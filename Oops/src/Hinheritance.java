//Run time polymorphism
// inheritance , method overiding and upcasting

class Algebra{
	public void m1() {
		System.out.println("Welcome to Algebra");
	}
	public void m2() {
		System.out.println("Operation");
	}
}
class Add extends Algebra{
	String s = "A";
	@Override
	public void m2() {
		System.out.println("ADD operation");
	}
	public void m3() {
		System.out.println("hi operation");
	}
}
class Sub extends Algebra{
	@Override
	public void m2() {
		System.out.println("Sub operation");
	}
}
class Mul1 extends Algebra{
	@Override
	public void m2() {
		System.out.println("Mul operation");
	}
}
class Div extends Algebra{
	@Override
	public void m2() {
		System.out.println("Div operation");
	}
}
public class Hinheritance {
	public static void main(String[] args) {
		Algebra a;
		a = new Add();
		Add add = (Add)a;
		add.m1();
		add.m2();
		add.m3();
		
	}
}
