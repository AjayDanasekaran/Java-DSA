//equals method override
package SectionIII;

public class HashCode {
	String name;
	int id;
	double d;
	byte b;
	
	HashCode(String name,int id,double d,byte b){
		this.name = name;
		this.id = id;
		this.d=d;
		this.b=b;
	}
	
	@Override
	public boolean equals(Object o) {
		HashCode h=(HashCode)o;
		if(id==h.id && name==h.name && d==h.d && b==h.b) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode()+id+(int)d+(int)b;
	}
	
	public static void main(String[] args) {
		HashCode h =  new HashCode("Ajay",100,2.0,(byte)34);
		HashCode h1 = new HashCode("ajay",100,2.0,(byte)34);
		System.out.println(h.equals(h1));
		System.out.println(h.hashCode()==h1.hashCode());
	}
}
