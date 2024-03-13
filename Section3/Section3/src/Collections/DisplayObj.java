package Collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class DisplayObj {
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<>();
        al.add("ajay");
        al.add(10);
        al.add(false);
        al.add('c');
        al.add("rahul");
        al.add(123L); // Use L for long literals
        al.add(20.0d); // Use 0.0d for double literals

        System.out.println(al);

        ListIterator<Object> i = al.listIterator();
        while (i.hasNext()) {
            Object o = i.next();
            if (o instanceof Integer) {
                System.out.println("Integer: " + o);
            } else if (o instanceof Character) {
                System.out.println("Character: " + o);
            } else if (o instanceof Double) {
                System.out.println("Double: " + o);
            } else if (o instanceof String) {
                System.out.println("String: " + o);
            }
        }
    }
}
