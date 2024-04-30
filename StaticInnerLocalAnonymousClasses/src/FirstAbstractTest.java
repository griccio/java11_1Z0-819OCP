
/*
The Learn Programming Academy
Java SE 11 Developer 1Z0-819 OCP Course - Part 2
Section 1: Java Fundamentals
Topic 1: Final modifier used with classes.
*/

import java.sql.SQLOutput;

abstract class ExtendMeRequired {
    // This method is valid for overriding
    public abstract void doSomething();

    public final void doSomethingFinally() {
        System.out.println("Overriding ExtendMeRequired.doSomethingFinally");
    }
}

class SecongExtendedClass extends ExtendMeRequired{

    @Override
    public void doSomething() {
        System.out.println("Implementation of this methow was required");
    }
}

public class FirstAbstractTest {
    public static void main(String[] args) {

        // Create an instance of the non-modified class
        // and execute it's methods
        ExtendMeOptional objectA = new ExtendMeOptional();
        objectA.doSomething();
        objectA.doSomethingFinally();

        // Create an instance of the final modified class
        // and execute it's methods
        ExtendMeNotAllowed objectB = new ExtendMeNotAllowed();
        objectB.doSomething();
        objectB.doSomethingFinally();

        ExtendMeRequired extendMeRequired = new ExtendMeRequired() {
            @Override
            public void doSomething() {
                System.out.println("Hello this is a anonymous class");
            }
        };
        extendMeRequired.doSomething();

        SecongExtendedClass secongExtendedClass = new SecongExtendedClass();
        secongExtendedClass.doSomething();
    }
}
