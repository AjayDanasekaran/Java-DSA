package Queue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Spliterator;
import java.util.Iterator;
import java.util.Comparator;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue with a custom comparator
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b) -> b - a);

        // Add elements to the priority queue
        priorityQueue.offer(5);
        priorityQueue.offer(3);
        priorityQueue.offer(8);
        priorityQueue.offer(1);

        // Print elements using iterator
        System.out.println("Priority Queue elements using Iterator:");
        Iterator<Integer> iterator = priorityQueue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Display the comparator used by the priority queue
        Comparator<? super Integer> comparator = priorityQueue.comparator();
        System.out.println("\nPriority Queue Comparator: " + comparator);

     // Get Spliterator from the underlying collection
        Spliterator<Integer> spliterator = priorityQueue.spliterator();

        // Use Spliterator to process elements
        System.out.println("Priority Queue elements using Spliterator:");
        spliterator.forEachRemaining(System.out::println);

        // Poll elements from the priority queue
        System.out.println("\nPriority Queue elements in descending order:");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}
