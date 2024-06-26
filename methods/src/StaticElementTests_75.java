/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 7: Creating and Using Methods
Topic: Create Methods and Constructors
Sub-Topic: static keyword
*/

    // This class demonstrates static fields, a static initializer, and
// a static method
    class StaticStuff {
        static String appName = "A Good App";

        // static initializer
        static {
            System.out.println("Initializing StaticStuff class");
            StaticStuff.counter++;
        }

        static void printAppName() {
            System.out.println("Application Name:  " + appName +
                    " : counter  = " + counter);
        }

        static int counter;
    }

    public class StaticElementTests_75  {
        public static void main(String[] args) {
            // We access static member of the StaticStuff class
            System.out.println("Application Name: " + StaticStuff.appName);
        }
    }

