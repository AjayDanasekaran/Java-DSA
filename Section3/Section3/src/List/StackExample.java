package List;

import java.util.List;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Creating a Stack
        Stack<String> stack = new Stack<>();

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
        boolean isEmpty = stack.empty();
        System.out.println("Is the stack empty? " + isEmpty);

        // Searching for an element in the stack
        int position = stack.search("Java");
        System.out.println("Position of 'Java' in the stack: " + position);
    }
}

