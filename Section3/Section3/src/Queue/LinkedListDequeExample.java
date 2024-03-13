package Queue;

import java.util.LinkedList;
import java.util.Deque;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class LinkedListDequeExample {
    public static void main(String[] args) {
        // Create a LinkedList as a Deque
        Deque<String> linkedListDeque = new LinkedList<>();

        // Adding elements to the front and end of the deque
        linkedListDeque.addFirst("Element 1");
        linkedListDeque.addLast("Element 2");
        linkedListDeque.offerFirst("Element 3");
        linkedListDeque.offerLast("Element 4");

        // Displaying elements
        System.out.println("Elements in the deque: " + linkedListDeque);

        // Using descendingIterator to iterate in reverse order
        System.out.println("Elements using descendingIterator:");
        Iterator<String> descendingIterator = linkedListDeque.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next());
        }

        // Converting LinkedList to NavigableSet for reverse order view
        NavigableSet<String> descendingSet = new TreeSet<>(linkedListDeque);
        System.out.println("Elements using descendingSet:");
        for (String element : descendingSet.descendingSet()) {
            System.out.println(element);
        }
    }
}
