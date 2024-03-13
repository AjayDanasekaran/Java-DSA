package com.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> scores = new HashMap<>();

        // Adding key-value pairs
        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.put("Charlie", 95);

        // Retrieving values
        int bobScore = scores.get("Bob");
        System.out.println("Bob's score: " + bobScore);
        
        System.out.println(scores);
        // Iterating over entries
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

