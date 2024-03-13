package Set;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class HashSetExample {
    public static void main(String[] args) {
        // Creating a HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Grapes");
        hashSet.add("Mango");

        // Using parallelStream to perform operations in parallel
        System.out.println("HashSet elements using parallelStream:");
        hashSet.parallelStream().forEach(System.out::println);

        // Using removeIf to remove elements based on a condition
        hashSet.removeIf(fruit -> fruit.startsWith("A"));

        System.out.println("\nHashSet after removing elements starting with 'A':");
        hashSet.forEach(System.out::println);

        // Using stream to create a new set with modified elements
        Set<String> uppercasedSet = hashSet.stream()
                                           .map(String::toUpperCase)
                                           .collect(Collectors.toSet());

        System.out.println("\nNew HashSet with uppercase elements:");
        uppercasedSet.forEach(System.out::println);
    }
}

