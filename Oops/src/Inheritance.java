public class Inheritance {
	public static void main(String[] args) {
		System.out.println("Output for English");
		English e = new English();
		e.intro();
		e.name();
		e.self();
		System.out.println("Output for Kannada");
		Kannada k = new Kannada();
		k.intro();
		k.name();
		k.self();
		System.out.println("Output for Tamil");
		Tamil t = new Tamil();
		t.intro();
		t.name();
		t.self();
	}
}
class English{
	void intro() {
		System.out.println("Hi");
	}
	void name() {
		System.out.println("What is your name?");
	}
	void self() {
		System.out.println("How are you?");
	}
}
class Kannada extends English{
	void name() {
		System.out.println("nin yesaru yenu?");
	}
}
class Tamil extends English{
	void name() {
		System.out.println("Un per enna?");
	}
}
