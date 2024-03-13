package Collections;

public class QueueImp {
    int front = -1, rear = -1;
    int size;
    int[] q;

    QueueImp(int size) {
        this.size = size;
        q = new int[size];
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    public void enqueue(int data) {
        if (!isFull()) {
            rear = (rear + 1) % size;
            q[rear] = data;
        } else {
            System.out.println("Queue Overflow");
        }
    }

    public void dequeue() {
        if (!isEmpty()) {
            int d = q[front];
            front = (front + 1) % size;
        } else {
            System.out.println("Queue Underflow");
        }
    }
}

