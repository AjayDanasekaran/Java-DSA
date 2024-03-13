package Collections;
import java.util.ArrayList;
import java.util.ListIterator;

public class StringObj {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("ajay");
		al.add("ujwal");
		al.add("sahana");
		al.add("kaavya");
		al.add("rahul");
		al.add("vinneta");
		al.add("dhai");
		al.add("zo");
		System.out.println(al);
		ListIterator<String> i= al.listIterator();
		while(i.hasNext()) {
			Object o = i.next();
			if(o instanceof String) {
				String s = (String)o;
				if(s.startsWith("s")) {
					System.out.println("startsWith s "+s);
				}
				else if(s.endsWith("i")) {
					System.out.println("endsWith i "+s);
				}
				else if(s.contains("a")){
					System.out.println("contains a "+s);
				}
			}
		}
	}
}
