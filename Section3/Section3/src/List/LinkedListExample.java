package List;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements at the beginning and end
        linkedList.addFirst("First");
        linkedList.addLast("Last");

        // Displaying the LinkedList
        System.out.println("LinkedList after adding first and last: " + linkedList);

        // Retrieving the first and last elements
        String firstElement = linkedList.getFirst();
        String lastElement = linkedList.getLast();
        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);

        // Removing the first and last elements
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("LinkedList after removing first and last: " + linkedList);

        // Adding elements with offer() and offerLast()
        linkedList.offer("NewFirst");
        linkedList.offerLast("NewLast");
        System.out.println("LinkedList after offering first and last: " + linkedList);

        // Polling elements from different positions
        String polledElement = linkedList.poll();
        String polledFirstElement = linkedList.pollFirst();
        String polledLastElement = linkedList.pollLast();
        System.out.println("Polled Element: " + polledElement);
        System.out.println("Polled First Element: " + polledFirstElement);
        System.out.println("Polled Last Element: " + polledLastElement);

        // Displaying the final state of the LinkedList
        System.out.println("Final LinkedList: " + linkedList);
    }
}
