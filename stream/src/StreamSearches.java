
/*
The Learn Programming Academy
Java SE 11 Developer 1Z0-819 OCP Course - Part 2
Section 8: Lambda Operations on Stream
Topic: Searching Streams
*/

import java.util.*;
import java.util.stream.Stream;

// Test search methods on a Stream
public class StreamSearches {
    public static void main(String[] args) {

        Random r = new Random();
        Optional<Integer> anyItem =
                // Infinite Stream
                Stream.generate(() -> r.nextInt(20))
                        // Print elements on stream at this point
                        .limit(10)
                        .peek(System.out::println)

                        .sorted()
                        // Check if any elements generated by Stream.generate()
                        .findAny();

        System.out.print("What is an element found on stream? ");
        anyItem.ifPresent(System.out::println);

        System.out.println("\n----------------");
        Optional<Integer> firstItem =
                // Infinite Stream
                Stream.generate(() -> r.nextInt(20))
                        // Print elements on stream at this point
                        .peek(System.out::println)
                        // Check first element generated by Stream.generate()
                        .findFirst();

        System.out.print("What is first element found on stream? ");
        firstItem.ifPresent(System.out::println);

         anyItem =
                // Infinite Stream
                Stream.generate(() -> r.nextInt(20))
                        // limit
                        .limit(5)
                        // Print elements on stream at this point
                        .peek(System.out::println)
                        // sort
                        .sorted()
                        // Check if any elements generated by Stream.generate()
                        .findAny();

        System.out.print("What is an element found on stream? ");
        anyItem.ifPresent(System.out::print);
        System.out.println("\n----------------");
        firstItem =
                // Infinite Stream
                Stream.generate(() -> r.nextInt(20))
                        // limit
                        .limit(5)
                        // Print elements on stream at this point
                        .peek(System.out::println)
                        // sort
                        .sorted()
                        // Check if any elements generated by Stream.generate()
                        .findFirst();

        System.out.print("What is first element found on stream? ");
        firstItem.ifPresent(System.out::print);
        System.out.println("\n----------------");

        List<String> aList = List.of();
        Optional<String> anyString = aList.stream().findAny();

        System.out.print("Was any element found on stream? ");
        anyString.ifPresentOrElse(
                System.out::print, () -> System.out.println("Nope"));

        Optional<String> firstString = aList.stream().findFirst();
        System.out.print("Was a first element found on stream? ");
        firstString.ifPresentOrElse(
                System.out::print, () -> System.out.println("Nope"));



        System.out.println("\n------ Test Match Methods ----------");
        // Create some test data
        List<String> initialData = List.<String>of("One", "Two", "Three",
                "Four", "Five", "Six");
        Set<String> unOrderedSet = new HashSet<String>(initialData);
        // Test if any elements have a length of 6 using anyMatch
        boolean anyMatch = unOrderedSet.stream()
                .anyMatch((s) -> s.length() == 6);

        System.out.println("This list " +
                (anyMatch ? "does contain" : "does NOT contain") +
                " elements whose length == 6");

        // Test if all elements have a length of 5 ore less
        boolean allMatch = unOrderedSet.stream()
                .allMatch((s) -> s.length() < 6);

        System.out.println("All elements in this list " +
                (allMatch ? "are" : "are NOT") +
                " of a length < 6 ");

        // Test if no elements have a length of 6.
        boolean noneMatch = unOrderedSet.stream()
                .noneMatch((s) -> s.length() == 6);

        System.out.println("This list " +
                (noneMatch ? "does NOT contain" : "does contain") +
                " elements whose length == 6");

    }
}
/**
 5
 What is an element found on stream? 5
 ----------------
 0
 What is first element found on stream? 0
 12
 3
 9
 7
 14
 What is an element found on stream? 3
 ----------------
 12
 4
 15
 4
 11
 What is first element found on stream? 4
 ----------------
 Was any element found on stream? Nope
 Was a first element found on stream? Nope
 */