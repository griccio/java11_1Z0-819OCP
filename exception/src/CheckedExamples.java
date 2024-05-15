
/*
The Learn Programming Academy
Java SE 11 Developer 1Z0-819 OCP Course - Part 2
Section 2: Exception Handling and Assertions
Topic:  Custom Exceptions
Sub-Topic:  Custom Checked Examples - Catch/Specify Requirements
*/

// A custom exception which extends Throwable (checked).
class CustomThrowable extends Throwable {
    // Custom exceptions are like any other class and can have
    // members of many flavors.  Here a constant is defined.
    private static final int ERROR_CODE = 1234;

    // Default constructor (super() is implied), an exception
    // created with this constructor has a null message
    CustomThrowable() {

    }

    // You can leverage Throwable's constructors and customize
    CustomThrowable(String message) {
        super(message + " (" + ERROR_CODE + ")");

    }

    // You can leverage Throwable's constructors and customize
    CustomThrowable(String message, Throwable e) {
        super(message + " (" + ERROR_CODE + ")", e);
        // Want custom exception of this type to do additional something
        doSomethingSpecial();
    }

    void doSomethingSpecial() {
        System.out.println("[First] Send alert, log or persist information");
    }

}

public class CheckedExamples {

    // main method to exercise both methods
    public static void main(String[] args) throws Throwable {

        CheckedExamples cex = new CheckedExamples();
        System.out.println("------- Custom Throwable Handled -------");
        // try/catch not required since method handles exception
        cex.handleThrowable();
        try {
            System.out.println("---- Custom Throwable Thrown/Caught -------");
            cex.throwThrowable(0);
        } catch (CustomThrowable c) {
            c.printStackTrace(System.out);
        }
        System.out.println("---- Custom Throwable Thrown/Not Caught -----");
        cex.throwThrowable(1);

    }

    // This method does NOT handle the custom exception thrown
    // Note that the exception is declared in the throws clause
    private void throwThrowable(int i) throws CustomThrowable {
        try {
            // Customizing existing platform exception with message
            throw new IllegalStateException("Whoops, This is bad");
        } catch (Exception e) {
            // Calls constructor on CustomThrowable that takes message
            // and originating Exception
            if (i == 0) throw new CustomThrowable("Caught and Re-Thrown", e);

            // Note that exception is ignored if i <> 0
        }
        // Calls constructor on CustomThrowable that takes message
        if (i == 1) throw new CustomThrowable("Created and Thrown");

    }

    // This method handles the checked exception it throws
    // Note that this method declares no exceptions in a throws clause
    private void handleThrowable() {
        try {
            // Creating with no args constructor & throwing
            throw new CustomThrowable();
        } catch (CustomThrowable c) {
            // Method handles all CustomThrowable thrown within it
            c.printStackTrace(System.out);
        }
    }
}
