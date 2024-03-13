package List;

import java.util.Vector;
import java.util.Enumeration;

public class VectorExample {
    public static void main(String[] args) {
        // Create a Vector
        Vector<String> vector = new Vector<>();

        // Add elements to the Vector
        vector.addElement("Java");
        vector.addElement("Python");
        vector.addElement("C++");

        // Display the elements using Enumeration
        System.out.println("Elements in the Vector:");
        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        // Access elements using elementAt
        System.out.println("\nElement at index 1: " + vector.elementAt(1));

        // Access the first and last elements
        System.out.println("First element: " + vector.firstElement());
        System.out.println("Last element: " + vector.lastElement());

        // Remove an element
        vector.removeElement("Python");
        System.out.println("\nVector after removing 'Python': " + vector);

        // Remove element at index 0
        vector.removeElementAt(0);
        System.out.println("Vector after removing element at index 0: " + vector);

        // Remove all elements
        vector.removeAllElements();
        System.out.println("Vector after removing all elements: " + vector);

        // Add more elements to demonstrate capacity
        vector.addElement("JavaScript");
        vector.addElement("Ruby");
        vector.addElement("Go");

        // Display the current capacity
        System.out.println("\nCurrent capacity of the Vector: " + vector.capacity());

        // Trim the capacity to the vector's size
        vector.trimToSize();
        System.out.println("Vector after trimming capacity: " + vector);

        // Set the size of the vector
        vector.setSize(2);
        System.out.println("Vector after setting size to 2: " + vector);
    }
}

