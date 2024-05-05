/*
The Learn Programming Academy
Java SE 11 Developer 1Z0-819 OCP Course - Part 2
Section 8: Lambda Operations on Stream
Topic: Using Collector
*/

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollect {
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
    }
}
