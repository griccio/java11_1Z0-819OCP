/*
The Learn Programming Academy
Java SE 11 Developer 1Z0-819 OCP Course - Part 2
Section 8: Lambda Operations on Stream
Topic: Using Collector
*/

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MyStreamCollectExamples {
    public static void main(String[] args) {

        // Create a List which will be used as source of stream pipelines
        List<String> originalList =
                new ArrayList<>(List.of("First", "Second", "Third"));

        // Using stream to add 'ish' to all elements,creating another list
        List<String> firstList = originalList.stream().map((s) -> s + "ish")
                .collect(Collectors.toList());

        // Add another element to list returned from collect
        firstList.add("Fourthish");

        // Print both lists
        System.out.println("originalList = " + originalList);
        System.out.println("firstList = " + firstList);

        //Counting
        Long count = firstList.stream().collect(Collectors.counting());
        System.out.println("firstList count " + count);

        List<Integer> myList = new Random().ints(0,100)
                .limit(100)
                .boxed()
                .collect(Collectors.toList());
        System.out.println("myList is : " + myList);
        double average = myList.stream()
                .collect(Collectors.averagingInt(s ->s));
        System.out.println("Average is " + average);

        Integer maxBy = myList.stream()
                .collect(Collectors.maxBy((a,b)->a.compareTo(b))).get();
        System.out.println("maxBy is " + maxBy);

        IntSummaryStatistics summary = myList.stream()
                .collect(Collectors.summarizingInt((s)->s));
        System.out.println("summary " + summary);

        Integer sum = myList.stream()
                .collect(Collectors.summingInt((s)->s));
        System.out.println("summing =" + sum);

        String str = originalList.stream().collect(Collectors.joining(", "));
        System.out.println("originalList joining with ', ': " + str);
    }
}

/**
 originalList = [First, Second, Third]
 firstList = [Firstish, Secondish, Thirdish, Fourthish]
 firstList count 4
 myList is : [72, 70, 73, 90, 35, 62, 51, 45, 71, 71, 28, 70, 33, 78, 33, 73, 47, 60, 89, 96, 86, 82, 1, 65, 6, 92, 52, 50, 25, 38, 64, 75, 96, 50, 73, 51, 3, 45, 71, 18, 40, 54, 98, 7, 28, 56, 78, 57, 14, 53, 13, 0, 1, 68, 95, 58, 29, 93, 1, 96, 29, 3, 14, 55, 84, 70, 86, 64, 18, 47, 99, 64, 86, 57, 71, 50, 70, 51, 41, 95, 15, 60, 80, 23, 4, 3, 31, 85, 70, 55, 62, 69, 18, 40, 38, 47, 31, 5, 36, 53]
 Average is 52.08
 maxBy is 99
 summary IntSummaryStatistics{count=100, sum=5208, min=0, average=52.080000, max=99}
 summing =5208
 originalList joining with ', ': First, Second, Third
 */