package Map;

import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Adding key-value pairs to the TreeMap
        treeMap.put("Alice", 25);
        treeMap.put("Bob", 30);
        treeMap.put("Charlie", 28);
        treeMap.put("David", 35);

        // Using TreeMap methods
        System.out.println("TreeMap entries:");
        System.out.println("Comparator: " + treeMap.comparator());
        System.out.println("First Key: " + treeMap.firstKey());
        System.out.println("Last Key: " + treeMap.lastKey());

        // Creating submap and headmap
        SortedMap<String, Integer> subMap = treeMap.subMap("Bob", "David");
        SortedMap<String, Integer> headMap = treeMap.headMap("Charlie");

        System.out.println("Submap (Bob to David): " + subMap);
        System.out.println("Headmap (up to Charlie): " + headMap);

        // Iterating through the entries in the TreeMap
        System.out.println("TreeMap entries:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Checking if a key is present
        String keyToCheck = "Alice";
        if (treeMap.containsKey(keyToCheck)) {
            System.out.println(keyToCheck + " is present in the TreeMap.");
        } else {
            System.out.println(keyToCheck + " is not present in the TreeMap.");
        }

        // Displaying keySet, values, and entrySet
        System.out.println("Key Set: " + treeMap.keySet());
        System.out.println("Values: " + treeMap.values());
        System.out.println("Entry Set: " + treeMap.entrySet());
    }
}

