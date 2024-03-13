package DSA;
import java.util.LinkedList;
//A LinkedList is a data structure in Java that implements a doubly-linked list.
//It is a type of list that allows for efficient insertions and
//deletions at both the beginning and the end of the list. 

//Doubly-Linked Structure: Each node in the LinkedList has two references,
//one pointing to the previous node and one pointing to the next node.
//This structure allows for efficient insertions and deletions at both ends of the list.

//No Random Access: Unlike arrays or ArrayLists,
//LinkedLists do not provide constant-time random access to elements.
//Accessing an element at a specific index may require traversing the list from the beginning or end.

//Efficient Insertions and Deletions: Inserting or removing elements at the beginning
//or end of a LinkedList is an O(1) operation, making it suitable for scenarios where frequent insertions
//and deletions are needed.

//Traversal: You can traverse a LinkedList in both directions, which can be beneficial for some algorithms.

//Iterators: Java's LinkedList provides iterators for traversing the list. 
//You can use iterators to access elements sequentially.

//Not Synchronized: Like ArrayList, LinkedList is not synchronized,
//so if you need to use it in a multi-threaded environment, you'll need to manage synchronization manually.

//Size and Performance: The size of a LinkedList can be efficiently obtained using the size() method.
//However, performance for searching for a specific element in a large LinkedList is slower than in an ArrayList.
public class LinkedListDSA {
	public static void main(String[] args) {
        // Create a LinkedList of integers
        LinkedList<Integer> numbers = new LinkedList<>();

        // Add elements at the end
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Add elements at the beginning
        numbers.addFirst(5);
        numbers.addLast(40);

        // Remove the first and last elements
        numbers.removeFirst();
        numbers.removeLast();

        // Iterate through the elements using a for-each loop
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
