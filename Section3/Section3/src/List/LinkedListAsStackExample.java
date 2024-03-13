package List;

import java.util.LinkedList;

public class LinkedListAsStackExample {
    public static void main(String[] args) {
        // Creating a stack using LinkedList (Deque interface)
        LinkedList<String> stack = new LinkedList<>();

        // Pushing elements onto the stack
        stack.push("Java");
        stack.push("is");
        stack.push("fun!");

        // Displaying the stack
        System.out.println("Stack: " + stack);

        // Peeking at the top element without removing it
        String topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        // Popping the top element
        String poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

        // Displaying the modified stack
        System.out.println("Stack after pop: " + stack);

        // Checking if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);
    }
}

