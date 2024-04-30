/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 3: Working with Java Primitive Data Types and String APIs
Topic: Create and Manipulate Strings
Sub-Topic:  Splitting and Joining Strings.
*/

import java.util.ArrayList;
import java.util.Arrays;

public class StringSpliceAndDice {
    public static void main(String[] args) {
        // Set some data up
        String[] wordArray = {"Hello", "World", "How", "are", "you"};
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(wordArray));

        // ---- public String concat(String str)
        String sentence = "";

        for (String word : wordArray) {
            sentence += word + " ";
        }
        System.out.println("Our sentence using concat: " + sentence);

        // You can use join with a variable list of CharSequence elements ..
        sentence = String.join(", ", "Hello", "World", "How", "are", "you");
        System.out.println("Our sentence using join, variable list of String: " + sentence);

// You can use join with Iterable elements, such as array of String
        sentence = String.join(" ", wordArray);
        System.out.println("Our sentence using join, Array of String: " + sentence);

// You can use join with Iterable elements, such as List of String
        sentence = String.join(" ", wordList);
        System.out.println("Our sentence using join, ArrayList of String: " + sentence);


        String[] words = sentence.split(" ");
        System.out.println("words: " + Arrays.toString(words));



    }
}