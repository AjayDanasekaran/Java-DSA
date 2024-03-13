package DSA;

import java.util.ArrayList;

class DynamicStack<T> {
    private ArrayList<T> stackArray = new ArrayList<>();

    public void push(T item) {
        stackArray.add(item);
    }

    public T pop() {
        if (!isEmpty()) {
            return stackArray.remove(stackArray.size() - 1);
        } else {
            System.out.println("Stack is empty.");
            return null;
        }
    }

    public T peek() {
        if (!isEmpty()) {
            return stackArray.get(stackArray.size() - 1);
        } else {
            System.out.println("Stack is empty.");
            return null;
        }
    }

    public boolean isEmpty() {
        return stackArray.isEmpty();
    }

    public int size() {
        return stackArray.size();
    }
}

