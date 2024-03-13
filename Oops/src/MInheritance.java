//one subclass acquiring from superclass, and that superclass acquiring from another super class
public class MInheritance {
	public static void main(String[] args) {
//		Sample s = new Sample();
//		s.display();
//		s.wish();
		Test t = new Test();
		t.wish();
		t.fly();
		t.display1();
	}
}
class Demo1{
	public void display1() {
		System.out.println("Display is in DemoClass");
	}
}
class Sample extends Demo1{
	public void wish() {
		System.out.println("Wish is in SampleClass");
	}
}
class Test extends Sample{
	public void fly() {
		System.out.println("Fly is in Test class");
	}
}
