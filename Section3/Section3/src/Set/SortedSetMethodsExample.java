package Set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetMethodsExample {
    public static void main(String[] args) {
        // Creating a SortedSet (TreeSet is used for ordering)
        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("Banana");
        sortedSet.add("Apple");
        sortedSet.add("Orange");
        sortedSet.add("Grapes");
        sortedSet.add("Mango");

        // 1. Comparator
        System.out.println("Comparator: " + sortedSet.comparator());

        // 2. First
        System.out.println("First element: " + sortedSet.first());

        // 3. Last
        System.out.println("Last element: " + sortedSet.last());

        // 4. HeadSet
        SortedSet<String> headSet = sortedSet.headSet("Orange");
        System.out.println("HeadSet (strictly less than Orange): " + headSet);

        // 5. TailSet
        SortedSet<String> tailSet = sortedSet.tailSet("Orange");
        System.out.println("TailSet (greater than or equal to Orange): " + tailSet);

        // 6. SubSet
        SortedSet<String> subSet = sortedSet.subSet("Banana", "Grapes");
        System.out.println("SubSet (range from Banana to Grapes): " + subSet);
    }
}

