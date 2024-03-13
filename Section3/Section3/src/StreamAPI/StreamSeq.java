package StreamAPI;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamSeq {
    public static void main(String[] args) {
    	
//    	create a stream From a Collection:
    	List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
    	Stream<String> streamFromList = myList.stream();
    	
//    	create a stream From an Array:
    	String[] array = {"a1", "a2", "b1", "c2", "c1"};
    	Stream<String> streamFromArray = Arrays.stream(array);

//    	create a stream From values:
    	Stream<String> streamOfValues = Stream.of("a1", "a2", "b1", "c2", "c1");

        List<String> l = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        // Create a new stream for each operation
        Stream<String> startsWithC = l.stream().filter(a -> a.startsWith("c"));
        startsWithC.forEach(System.out::println);

        Stream<String> upperC = l.stream().map(String::toUpperCase);
        upperC.forEach(System.out::println);

        Stream<String> sortedStream = l.stream().sorted();
        sortedStream.forEach(System.out::println);
    }
}
