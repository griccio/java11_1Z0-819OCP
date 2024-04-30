/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 3: Working with Java Primitive Data Types and String APIs
Topic: Create and Manipulate Strings
Sub-Topic:  String replace and substring.
*/

public class StringReplacement {
    public static void main(String[] args) {

        // Create variables.
        String mississippi = "Mississippi";
        String[] resultArray = new String[4];

        // Example of: replace(char oldChar, char newChar)
        // Returns a String
        resultArray[0] = "Replace s with S : " + mississippi.replace('s', 'S');

        // Example of: replace(CharSequence target, CharSequence replacement)
        // Returns a String
        resultArray[1] = "Replace literal \"iss\" with \"ips\" : " +
                mississippi.replace("iss", "ips");

        // Example of: replaceAll(String regex, String replacement)
        // Returns a String
        resultArray[2] = "Replace regexp [i with 2 characters(s or p)] with literal \"ax\" : " +
                mississippi.replaceAll("(i(s|p){2})", "ax");

        // Example of: replaceFirst(String regex, String replacement)
        // Returns a String
        resultArray[3] = "Replace first match of regexp [i with 2 characters(s or p)] " +
                "with literal \"ax\" : " +
                mississippi.replaceFirst("(i(s|p){2})", "ax");

        // Printing our resultArray to console
        for (String result : resultArray) {
            System.out.println(result);
        }
        System.out.println(mississippi.substring(7));
        System.out.println(mississippi.substring(3,7));

        StringBuilder sb = new StringBuilder("Hello world this is me, Hello again");
        System.out.println(sb.substring(7));
        System.out.println(sb.subSequence(0,5));

    }
}