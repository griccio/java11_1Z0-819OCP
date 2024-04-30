/*
The Learn Programming Academy
Java SE 11 Developer 1Z0-819 OCP Course - Part 2
Section 8: Lambda Operations on Stream
Topic:  Extract stream data using map, peek and flatMap
*/

import element.Course;
import element.Student;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExamples {
    public static void main(String[] args) {

        // Local Variable studentList will contain results
        List<Student> studentList = Stream.of(
                        // Stream of courses created
                        new Course("Geometry 101", 3),
                        new Course("Java 101", 5),
                        new Course("History 101", 4))
                // Map from course object to a stream of student objects
                .flatMap(course ->
                        course.getStudentList().stream()
                )
                // Terminal operation returns list of student
                .collect(Collectors.toList());

        // Print the entire student list for all courses
        System.out.println("Complete Student Population: ");
        studentList.forEach(System.out::println);
    }
}
/**
 Complete Student Population:
 [1001 : Allen : Geometry 101]
 [1002 : James : Geometry 101]
 [1003 : Caleb : Geometry 101]
 [1004 : Greg : Java 101]
 [1005 : Bob : Java 101]
 [1006 : Allen : Java 101]
 [1007 : Fred : Java 101]
 [1008 : Caleb : Java 101]
 [1009 : Caleb : History 101]
 [1010 : Allen : History 101]
 [1011 : Caleb : History 101]
 [1012 : Caleb : History 101]
 */