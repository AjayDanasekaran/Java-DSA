package List;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeAsStackExample {
    public static void main(String[] args) {
        // Creating a stack using Deque interface (ArrayDeque implementation)
        Deque<String> stack = new ArrayDeque<>();

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

