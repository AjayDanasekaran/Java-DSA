package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorExample {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("One");
        myList.add("Two");
        myList.add("Three");
        myList.add("Four");
        myList.add("Five");

        Spliterator<String> spliterator = myList.spliterator();

        // Processing elements sequentially
        spliterator.forEachRemaining(System.out::println);

        // Processing elements in parallel
        Spliterator<String> secondSpliterator = spliterator.trySplit();
        if (secondSpliterator != null) {
            secondSpliterator.forEachRemaining(System.out::println);
        } else {
            System.out.println("Second Spliterator is null or not efficiently splittable.");
        }
    }
}


