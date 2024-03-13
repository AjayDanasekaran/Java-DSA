//equals method override
package SectionIII;

public class Equals {
	String name;
	int id;
	
	Equals(String name,int id){
		this.name = name;
		this.id = id;
	}
	@Override
	public boolean equals(Object o) {
		Equals e=(Equals)o;
		if(id==e.id && name==e.name) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Equals e =  new Equals("Ajay",100);
		Equals e1 = new Equals("ajay",100);
		System.out.println(e.equals(e1));
		System.out.println(e.hashCode());
		System.out.println(e1.hashCode());

	}
}
