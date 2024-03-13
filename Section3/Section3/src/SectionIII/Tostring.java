//toString methods overrides

package SectionIII;

public class Tostring extends Object{
	String name;
	int id;
	
	Tostring(String name,int id){
		this.name = name;
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "name : "+this.name+"\nID : "+this.id;
	}
	
	public static void main(String[] args) {
		Tostring t = new Tostring("ajay",123);
		System.out.println(t.toString());
	}
}
