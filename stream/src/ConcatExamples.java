
/*
The Learn Programming Academy
Java SE 11 Developer 1Z0-819 OCP Course - Part 2
Section 7: Java Stream API
Topic:  Stream concat method
*/

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class ConcatExamples {
    public static void main(String[] args) {

        // Set up some test data
        Set tree1 = new TreeSet(List.of("Ralph", "Larry", "Carol"));
        Set tree2 = new TreeSet(List.of("Mark", "Mary", "Maggie"));

        // Print each set's elements
        System.out.println("TreeSet orders naturally, " +
                "print using Set.forEach --");
        System.out.println("---First---");
        tree1.forEach(System.out::println);
        System.out.println("---Second---");
        tree2.forEach(System.out::println);

        System.out.println("TreeSet orders naturally, " +
                "print using stream().forEach() --");

        // Create streams for each Set, print each stream's elements
        Stream<String> stream1 = tree1.stream();
        System.out.println("---First---");
//        stream1.forEach(System.out::println);

        Stream<String> stream2 = tree2.stream();
        System.out.println("---Second---");
//        stream2.forEach(System.out::println);
        Stream<String> merge = Stream.concat(stream1,stream2);
        merge = merge.limit(3);
        merge.forEach(System.out::println);
    }
}
