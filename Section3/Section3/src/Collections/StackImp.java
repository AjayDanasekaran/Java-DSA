package Collections;
import java.util.EmptyStackException;

public class StackImp {
    int top;
    int capacity;
    int[] stack;

    StackImp(int capacity) {
        top = -1;
        this.capacity = capacity;
        stack = new int[capacity];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }

    public void push(int data) {
        if (!isFull()) {
            top++;
            stack[top] = data;
            System.out.println(data + " pushed to stack");
        } else {
            System.err.println("Stack Overflow");
        }
    }

    public int pop() throws EmptyStackException {
        if (!isEmpty()) {
            int poppedValue = stack[top];
            top--;
            return poppedValue;
        } else {
            throw new EmptyStackException();
        }
    }

    public int peek() {
        return stack[top];
    }
}
