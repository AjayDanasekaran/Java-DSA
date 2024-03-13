package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap using the Map interface
        Map<String, Integer> hashMap = new HashMap<>();

        // Adding key-value pairs to the HashMap
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 28);
        hashMap.put("David", 35);

        // Accessing values using keys
        System.out.println("Age of Alice: " + hashMap.get("Alice"));
        System.out.println("Age of Bob: " + hashMap.get("Bob"));

        // Iterating through the entries in the HashMap
        System.out.println("HashMap entries:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Checking if a key is present
        String keyToCheck = "Alice";
        if (hashMap.containsKey(keyToCheck)) {
            System.out.println(keyToCheck + " is present in the HashMap.");
        } else {
            System.out.println(keyToCheck + " is not present in the HashMap.");
        }

        // Removing a key-value pair
        String keyToRemove = "Bob";
        if (hashMap.containsKey(keyToRemove)) {
            int removedAge = hashMap.remove(keyToRemove);
            System.out.println(keyToRemove + "'s age (removed): " + removedAge);
        } else {
            System.out.println(keyToRemove + " is not present in the HashMap.");
        }

        // Displaying updated entries after removal
        System.out.println("Updated HashMap entries:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
