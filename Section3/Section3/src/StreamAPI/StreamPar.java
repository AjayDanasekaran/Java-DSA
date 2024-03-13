package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Optional;

public class StreamPar {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        Stream<String> startsWithC = l.parallelStream().filter(a -> a.startsWith("c"));
//        startsWithC.forEach(System.out::println);

        Stream<String> upperC = l.parallelStream().map(String::toUpperCase);
//        upperC.forEach(System.out::println);

        Stream<String> sortedStream = l.parallelStream().sorted();
//        sortedStream.forEach(System.out::println);
        
        Stream<String> flatMappedStream = l.parallelStream().flatMap(s -> Stream.of(s, s.toUpperCase()));
        flatMappedStream.forEach(System.out::println);
        
        List<String> collectedList = l.stream().filter(s -> s.startsWith("c")).collect(Collectors.toList());
        
        Optional<String> concatenated = l.stream().reduce((s1, s2) -> s1 + "#" + s2);
        System.out.println(concatenated);
        
     // Generate an infinite stream of random numbers
        Stream<Double> infiniteStream = Stream.generate(Math::random);

     // Generate an infinite stream of powers of 2
        Stream<Integer> powersOfTwo = Stream.iterate(1, n -> n * 2);

     // Generate the first 5 powers of 2
        Stream<Integer> firstFivePowersOfTwo = Stream.iterate(1, n -> n * 2)
                                                    .limit(5);

     // Generate an infinite stream of even numbers, then limit to the first 10
        List<Integer> firstTenEvenNumbers = Stream.iterate(0, n -> n + 2)
                                                  .limit(10)
                                                  .collect(Collectors.toList());


    }
}
