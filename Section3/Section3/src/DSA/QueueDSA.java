package DSA;

import java.util.Queue;
import java.util.LinkedList;

//Methods specific to the Queue interface:
//
//add(E e)
//element()
//offer(E e)
//peek()
//poll()
//remove()

public class QueueDSA {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        System.out.println("Front Element: " + queue.peek());

        int removedElement = queue.poll();
        System.out.println("Removed Element: " + removedElement);

        System.out.println("Is the queue empty? " + queue.isEmpty());
        System.out.println("Size of the queue: " + queue.size());
        
        int frontElement = queue.poll(); // Removes and returns the front element (1 in this case)
        int frontElement1 = queue.peek(); // Retrieves the front element (2 in this case)

    }
}

