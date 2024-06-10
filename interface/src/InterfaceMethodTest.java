/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 10: Programming Abstractly Through Interfaces
Topic: Create and implement interfaces
*/

interface InterfaceMethodExample {


    private static String privateStaticMethod() {
        return "private static";
    }
    static String publicStaticMethod() {
        // You can call private static method from public static method
        return InterfaceMethodExample.privateStaticMethod() + " then static";
    }
    private String privateMethod() {
        return "private";
    }

    // These methods are public implicitly
    default String defaultMethod() {
        // You can call private method from a default method
        return privateMethod() + " then default";
    }
    // This is the public method that would, in theory, be the method
    // that you want all implementing classes to have in common.
    void theImportantMethod();
}

public class InterfaceMethodTest implements InterfaceMethodExample {

    public static void main(String[] args) {
        System.out.println("\nExecuting concrete methods on interface");
// public static method can be accessed from type
        System.out.println(InterfaceMethodExample.publicStaticMethod());

// default method can be accessed from object which implements type
        InterfaceMethodTest it = new InterfaceMethodTest();
        System.out.println(it.defaultMethod());

        System.out.println("\nExecuting methods using the interface type");
        InterfaceMethodTest anotherIt = new InterfaceMethodTest();
        it.testInterface(anotherIt);

        Object o = anotherIt;
        it.testInterface(o);
    }

    public void theImportantMethod() {
        System.out.println("This is the important method that all objects " + "implementing InterfaceTest must override and implement ");
    }
    // Method that accepts the interface as a parameter
    public void testInterface(InterfaceMethodExample it) {
        System.out.println("Executing testInterface with InterfaceExample");
        it.theImportantMethod();
    }

    // Method that accepts on object as a parameter
    public void testInterface(Object o) {
        System.out.println("Executing testInterface with Object");
        // Using instanceof with an interface
        if (o instanceof InterfaceMethodExample) {
            // Casting using an interface
            InterfaceMethodExample it = (InterfaceMethodExample) o;
            it.theImportantMethod();
        }

    }

}
/**
 Executing methods using the interface type
 Executing testInterface with InterfaceExample
 This is the important method that all objects implementing InterfaceTest must override and implement
 Executing testInterface with Object
 This is the important method that all objects implementing InterfaceTest must override and implement
 */