package Collections;
import java.util.ArrayList;
import java.util.Iterator;

public class EvenObj {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		ArrayList<Integer> al1 = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		Integer in = al.get(1).intValue();
		Iterator i = al.iterator();
//		while(i.hasNext()) {
//			Object obj = i.next();
//			if(obj instanceof Integer) {
//				Integer a =(Integer) obj;
//				if(a%2==0) {
//				al1.add(a);
//				}
//			}
//		}
		while(i.hasNext()) {
			Object obj = i.next();
			if((Integer)obj%2==0) {
				al1.add((Integer) obj);
				}
			}
//		Iterator<Integer> iterator = al.iterator();
//        while (iterator.hasNext()) {
//            Integer a = iterator.next();
//            if (a % 2 == 0) {
//                al1.add(a);
//            }
//        }
		System.out.println(al1);
		for(Integer a: al1) {
			System.out.println(a);
		}
		
	}
}
