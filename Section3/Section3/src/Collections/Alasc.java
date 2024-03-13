package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Alasc {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(4);
        li.add(3);
        li.add(7);
        li.add(6);
        li.add(9);
        li.add(5);
        li.add(8);
        li.add(10);

        LinkedList<Integer> asc = new LinkedList<>(li);
        Collections.sort(asc);
        System.out.println("Ascending: " + asc);

        LinkedList<Integer> dsc = new LinkedList<>(li);
        Collections.sort(dsc, Collections.reverseOrder());
        System.out.println("Descending: " + dsc);
    }
}
