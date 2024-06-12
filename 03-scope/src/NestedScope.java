/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 3: Working with Java Primitive Data Types and String APIs
Topic: Identify the Scope of a variable
Sub-Topic: Out of the ordinary concepts
*/

public class NestedScope {
    public static void main(String[] args) {
        // local variable i declared and initialized
        int i = 10;

        class locallyDefinedClass {
            {
                // i from method scope still visible in nested local class
                System.out.println("value of i BEFORE LOOP  " + i);
                System.out.println("---------------");

                // Because this for loop is within a local class,this is valid
                for (int i = 0; i < 5; i++) {
                    System.out.println("value of i during FIRST loop " + i);
                }
                System.out.println("---------------");

                // the local variable i from previous loop has gone out of scope
                // so it is ok to create another local variable in the second loop
                // declaration of the same name.
                for (int i = 5; i > 0; i--) {
                    System.out.println("value of i during SECOND loop " + i);
                }
                System.out.println("---------------");

                //  assign local loop variable j to local variable i from the
                // surrounding method of the nested class,
                for (int j = i; j < 15; j++) {
                    System.out.println("value of i,j during THIRD loop " + i + "," + j);
                }
                System.out.println("value of i AFTER LOOP  " + i);
            }
        }
        System.out.println("value of i before local class instantiated " + i);
        new locallyDefinedClass();
        System.out.println("value of i after local class instantiated " + i);
    }
}
/*
value of i before local class instantiated 10
value of i BEFORE LOOP  10
        ---------------
value of i during FIRST loop 0
value of i during FIRST loop 1
value of i during FIRST loop 2
value of i during FIRST loop 3
value of i during FIRST loop 4
        ---------------
value of i during SECOND loop 5
value of i during SECOND loop 4
value of i during SECOND loop 3
value of i during SECOND loop 2
value of i during SECOND loop 1
        ---------------
value of i,j during THIRD loop 10,10
value of i,j during THIRD loop 10,11
value of i,j during THIRD loop 10,12
value of i,j during THIRD loop 10,13
value of i,j during THIRD loop 10,14
value of i AFTER LOOP  10
value of i after local class instantiated 10*/
