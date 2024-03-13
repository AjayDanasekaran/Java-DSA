package Set;

import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.Iterator;

public class NavigableSetMethodsExample {
    public static void main(String[] args) {
        // Creating a NavigableSet (TreeSet is used for ordering)
        NavigableSet<String> navigableSet = new TreeSet<>();
        navigableSet.add("Banana");
        navigableSet.add("Apple");
        navigableSet.add("Orange");
        navigableSet.add("Grapes");
        navigableSet.add("Mango");

        System.out.println("Original NavigableSet: " + navigableSet);

        // 1. Ceiling
        System.out.println("Ceiling (least element greater than or equal to 'G'): " + navigableSet.ceiling("G"));

        // 2. Floor
        System.out.println("Floor (greatest element less than or equal to 'G'): " + navigableSet.floor("G"));

        // 3. Higher
        System.out.println("Higher (least element strictly greater than 'G'): " + navigableSet.higher("G"));

        // 4. Lower
        System.out.println("Lower (greatest element strictly less than 'G'): " + navigableSet.lower("G"));

        // 5. Poll First
        System.out.println("Poll First (retrieve and remove the first element): " + navigableSet.pollFirst());

        // 6. Poll Last
        System.out.println("Poll Last (retrieve and remove the last element): " + navigableSet.pollLast());

        // 7. Descending Set
        NavigableSet<String> descendingSet = navigableSet.descendingSet();
        System.out.println("Descending Set: " + descendingSet);

        // 8. Descending Iterator
        Iterator<String> descendingIterator = navigableSet.descendingIterator();
        System.out.print("Descending Iterator: ");
        while (descendingIterator.hasNext()) {
            System.out.print(descendingIterator.next() + " ");
        }
        System.out.println();

        // 9. SubSet
        NavigableSet<String> subSet = navigableSet.subSet("Banana", true, "Orange", true);
        System.out.println("SubSet (inclusive range from Banana to Orange): " + subSet);

        // 10. HeadSet
        NavigableSet<String> headSet = navigableSet.headSet("Orange", true);
        System.out.println("HeadSet (inclusive range strictly less than Orange): " + headSet);

        // 11. TailSet
        NavigableSet<String> tailSet = navigableSet.tailSet("Orange", true);
        System.out.println("TailSet (inclusive range greater than or equal to Orange): " + tailSet);
    }
}

