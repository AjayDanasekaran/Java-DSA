package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class DisplayObjv1 {
    public static <T> void displayElements(List<T> list) {
        System.out.println(list);

        ListIterator<T> iterator = list.listIterator();
        while (iterator.hasNext()) {
            T element = iterator.next();
            System.out.println(element.getClass().getSimpleName() + ": " + element);
        }
    }

    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<>();
        al.add("ajay");
        al.add(10);
        al.add(false);
        al.add('c');
        al.add("rahul");
        al.add(123L);
        al.add(20.0d);

        displayElements(al);
    }
}

