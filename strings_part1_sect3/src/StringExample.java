/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 3: Working with Java Primitive Data Types and String APIs
Topic: Create and Manipulate Strings
Sub-Topic: Recap
*/

public class StringExample{
    public static void main(String[] args) {

        //******************************
        // TEST EQUALITY BETWEEN TWO STRING
        //******************************
        EqualLiteralReferences();
        StringConstructors();
        StringConstructorsInterned();



        String s1 = new String("Hello");
        String s2 = new String("Hello");
        s1.intern();
        s2.intern();
        System.out.println("s1.intern and s2.intern are string literals " +
                "assigned to String variables: (s1 == s2) = " +
                ((s1.intern() == s2.intern()) ? "true" : "false"));



        String s11 = "Hello World";
        String s21 = new String("Hello").toString() + "World";
        String s22 = new String("Hello World").toString();
        String s23 ="Hello" + "World";

        String s24 = s11;

        System.out.println("s1 and s2 are string literals " +
                "assigned to String variables: (s1 == s2) = " +
                ((s11 == s21) ? "true" : "false"));

        System.out.println("s1 and s2 are string literals " +
                "assigned to String variables: (s1 == s2) = " +
                ((s11 == s22) ? "true" : "false"));

        System.out.println("s1 and s2 are string literals " +
                "assigned to String variables: (s1 == s2) = " +
                ((s11 == s23) ? "true" : "false"));

        System.out.println("s1 and s2 are string literals " +
                "assigned to String variables: (s1 == s2) = " +
                ((s11 == s24) ? "true" : "false"));



        //TEST NULL VALUE
        String null1 = null;
        System.out.println("Value of string is " + null1);

        System.out.println("Value of string is " + null);

        String[] myArray ={null,null,null};
        System.out.println("Value of string is " + myArray);
        System.out.println("".concat("").concat("").length());// value is 0

//        System.out.println("".concat(null).length()); // runtime exception

    }

    public static void EqualLiteralReferences() {
        // String literals automatically interned so all "hello" literals
        // point to same reference in memory, in the string pool
        String s1 = "hello";

        String s2 = "hello";
        System.out.println("s1 and s2 are string literals " +
                "assigned to String variables: (s1 == s2) = " +
                ((s1 == s2) ? "true" : "false"));
    }

    public static void StringConstructors() {
        String s1 = new String("hello");
        String s2 = new String("hello");

        // Now evaluates to false, strings do not point to same reference,
        // and are not stored in the string pool
        System.out.println("s1 and s2 are constructed String objects " +
                "assigned to String variables: (s1 == s2) = " +
                ((s1 == s2) ? "true" : "false"));
    }

    public static void StringConstructorsInterned() {
        //**** Add intern() method:  intern checks the string pool
        // and returns the string pool reference to s1.
        String s1 = new String("hello").intern();

        //**** Add intern() method: s2 also gets the string pool
        // reference for "hello"
        String s2 = new String("hello").intern();

        // Now evaluates to true
        System.out.println("s1 and s2 are interned String objects " +
                "assigned to String variables: (s1 == s2) = " +
                ((s1 == s2) ? "true" : "false"));
    }
}