
/*
The Learn Programming Academy
Java SE 11 Developer 1Z0-819 OCP Course - Part 2
Section 8: Lambda Operations on Stream
Topic: Stream Operations min, max, count, reduce
*/

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamSimpleReductions {
    public static void main(String[] args) {

        // Local variable to house random list of Integer
        List<Integer> randomIntegerList;

        // Test count, min, max, 5x (change limit each iteration)
        for (int i = 0, limit = 1; i < 5; i++) {
            randomIntegerList =
                    //  returns an IntStream of random integers, here bound
                    // between 1 and 100,000 - introduced in Java 8
                    new Random().ints(1, 100)
                            // Transform from an IntStream to Stream<Integer>
                            .boxed()
                            // Limit by the limit variable which changes
                            .limit(limit).collect(Collectors.toList());

            // count method returns a long, not an Optional - result
            // equals limit value
            long count = randomIntegerList.stream().count();

            // max method returns an Optional, so use .get() to get value
            long max = randomIntegerList.stream()
                    // Max method requires Comparator, use static method
                    // on Comparator to use natural order for int
                    .max(Comparator.<Integer>naturalOrder())
                    .get();

            // min method returns an Optional, so use .get() to get value
            long min = randomIntegerList.stream()
                    .min(Comparator.<Integer>naturalOrder())
                    .get();

            double average = randomIntegerList.stream()
                    // mapToInt transforms to IntStream, one to one mapping
                    .mapToInt((s) -> s)
                    // Use average method, returns OptionalInt
                    .average()
                    // If OptionalInt is empty, set it to -1
                    .orElse(-1);

            double sum = randomIntegerList.stream()
                    // mapToInt transforms to IntStream, one to one mapping
                    .mapToInt((s) -> s)
                    // Use sum method
                    .sum();

            // Alter limit, higher limit- range gets closer to 1 & max
            limit *= 10;

            // Print data from stream terminal operations count, max, min
            System.out.println("Limit = " + count + ", min  = " + min
                    + ", " + "max = " + max + ", average  = " +
                    average + ", " + "sum = " + sum);
        }

    }
}
/**
 Limit = 1, min  = 99, max = 99, average  = 99.0, sum = 99.0
 Limit = 10, min  = 6, max = 95, average  = 51.1, sum = 511.0
 Limit = 100, min  = 1, max = 99, average  = 51.64, sum = 5164.0
 Limit = 1000, min  = 1, max = 99, average  = 51.918, sum = 51918.0
 Limit = 10000, min  = 1, max = 99, average  = 50.1805, sum = 501805.0
 */
