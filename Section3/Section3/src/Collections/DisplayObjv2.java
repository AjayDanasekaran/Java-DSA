package Collections;

import java.util.List;
import java.util.ListIterator;

public class DisplayObjv2 {
    public static <T> void displayElements(List<T> list) {
        System.out.println(list);

        ListIterator<T> iterator = list.listIterator();
        while (iterator.hasNext()) {
            T element = iterator.next();
            System.out.println(element.getClass().getSimpleName() + ": " + element);
        }
    }

    // Create an ArrayList of Objects
    private static List<Object> createObjectList() {
        List<Object> list = List.of("ajay", 10, false, 'c', "rahul", 123L, 20.0d);
        return List.copyOf(list);
    }

    // Create an ArrayList of Integers
    private static List<Integer> createIntegerList() {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        return List.copyOf(list);
    }
    
    public static void main(String[] args) {
        // Example 1: ArrayList of Objects
        displayElements(createObjectList());

        // Example 2: ArrayList of Integers
        displayElements(createIntegerList());
    }

}

