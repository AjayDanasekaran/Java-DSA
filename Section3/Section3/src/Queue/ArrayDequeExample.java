package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        // Creating an ArrayDeque
        Deque<String> arrayDeque = new ArrayDeque<>();

        // Adding elements to the front (head) of the deque
        arrayDeque.addFirst("Element 1");
        arrayDeque.addFirst("Element 2");

        // Adding elements to the end (tail) of the deque
        arrayDeque.addLast("Element 3");
        arrayDeque.addLast("Element 4");

        // Displaying the elements
        System.out.println("ArrayDeque elements: " + arrayDeque);

        // Removing elements from the front and end of the deque
        String firstElement = arrayDeque.removeFirst();
        String lastElement = arrayDeque.removeLast();

        // Displaying the modified deque
        System.out.println("Removed first element: " + firstElement);
        System.out.println("Removed last element: " + lastElement);
        System.out.println("Modified ArrayDeque: " + arrayDeque);
    }
}
