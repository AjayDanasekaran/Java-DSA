package DSA;
import java.util.Stack;
//A stack is a linear data structure that follows the Last-In-First-Out (LIFO) principle.
//In a stack, the last element added is the first to be removed. 
//Stacks are often used for tasks that involve keeping track of the order in which items
//were added and need to be processed in reverse order.

public class StackDSA {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		// Push elements onto the stack
		stack.push(1);
		stack.push(2);
		stack.push(3);

		// Pop elements from the stack
		int topElement = stack.pop(); // Removes and returns 3
		int topElement1 = stack.peek(); // Retrieves the top element (2 in this case)
		boolean isEmpty = stack.isEmpty(); // Returns false in this case
		stack.empty();
		int size = stack.size(); // Returns the number of elements (2 in this case)
		int position = stack.search(2);
	}
}

