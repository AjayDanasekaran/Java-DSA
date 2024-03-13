//In Java, the hybrid inheritance is the combination of two or more types of inheritance.

class Ajay{
	public void m1() {
		System.out.println("Ajay Loves Sahana");
	}
}
class Sahana extends Ajay{
	public void m2() {
		System.out.println("Sahana loves Ajay");
	}
}
class Kushi extends Sahana{
	public void m3() {
		System.out.println("Kushi loves Sahana");
	}
}
class Krishna extends Sahana{
	public void m3() {
		System.out.println("Krishna loves Sahana");
	}
}
class Hanuman extends Sahana{
	public void m3() {
		System.out.println("Hanuman loves Sahana");
	}
}
public class Hybridinheritance {
	public static void main(String[] args) {
		Sahana s = new Kushi();
		Kushi k = (Kushi)s;
		k.m1();
		k.m2();
		k.m3();
	}
}
