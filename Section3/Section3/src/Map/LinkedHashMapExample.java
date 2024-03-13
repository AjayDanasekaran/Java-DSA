package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Creating a LinkedHashMap using the Map interface
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Adding key-value pairs to the LinkedHashMap
        linkedHashMap.put("Alice", 25);
        linkedHashMap.put("Bob", 30);
        linkedHashMap.put("Charlie", 28);
        linkedHashMap.put("David", 35);

        // Accessing values using keys
        System.out.println("Age of Alice: " + linkedHashMap.get("Alice"));
        System.out.println("Age of Bob: " + linkedHashMap.get("Bob"));

        // Iterating through the entries in the LinkedHashMap
        System.out.println("LinkedHashMap entries:");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Checking if a key is present
        String keyToCheck = "Alice";
        if (linkedHashMap.containsKey(keyToCheck)) {
            System.out.println(keyToCheck + " is present in the LinkedHashMap.");
        } else {
            System.out.println(keyToCheck + " is not present in the LinkedHashMap.");
        }

        // Removing a key-value pair
        String keyToRemove = "Bob";
        if (linkedHashMap.containsKey(keyToRemove)) {
            int removedAge = linkedHashMap.remove(keyToRemove);
            System.out.println(keyToRemove + "'s age (removed): " + removedAge);
        } else {
            System.out.println(keyToRemove + " is not present in the LinkedHashMap.");
        }

        // Displaying updated entries after removal
        System.out.println("Updated LinkedHashMap entries:");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
