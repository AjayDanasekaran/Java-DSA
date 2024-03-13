package DSA;

class CustomStack {
    private int[] stackArray;
    private int top;
    private int maxSize;

    public CustomStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int item) {
        if (top < maxSize - 1) {
            stackArray[++top] = item;
        } else {
            System.out.println("Stack is full. Cannot push " + item);
        }
    }

    public int pop() {
        if (!isEmpty()) {
            return stackArray[top--];
        } else {
            System.out.println("Stack is empty.");
            return -1;
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty.");
            return -1;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
}

