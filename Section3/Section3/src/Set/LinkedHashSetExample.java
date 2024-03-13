package Set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Creating a LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Grapes");
        linkedHashSet.add("Mango");

        // Using parallelStream to perform operations in parallel
        System.out.println("LinkedHashSet elements using parallelStream:");
        linkedHashSet.parallelStream().forEach(System.out::println);

        // Using removeIf to remove elements based on a condition
        linkedHashSet.removeIf(fruit -> fruit.startsWith("A"));

        System.out.println("\nLinkedHashSet after removing elements starting with 'A':");
        linkedHashSet.forEach(System.out::println);

        // Using stream to create a new set with modified elements
        Set<String> uppercasedSet = linkedHashSet.stream()
                                                 .map(String::toUpperCase)
                                                 .collect(Collectors.toSet());

        System.out.println("\nNew LinkedHashSet with uppercase elements:");
        uppercasedSet.forEach(System.out::println);
    }
}
