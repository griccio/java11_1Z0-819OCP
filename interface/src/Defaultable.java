/*
The Learn Programming Academy
Java SE 11 Developer 1Z0-819 OCP Course - Part 2
Section 3: Interfaces
Topic:  Default methods
*/

public interface Defaultable {
    String abstractValue = "ABSTRACT";
    void abstractMethod();
    default void defaultNotAbstractMethod() {
        System.out.println("Testing Default");
    }
}

// Class implements Defaultable interface
class ImplementingClass implements Defaultable {
    public void abstractMethod() {
        System.out.println("ImplementingClass" +
                " implements interface's abstract method");
    }
}

// Create a base class that has method with same signature default
// method in interface
class BaseClass {
    public void defaultNotAbstractMethod() {
        System.out.println("Testing defaultNotAbstractMethod on class");
    }
}

// Class which uses the interface in a method as a parameter type.
class DefaultClass extends BaseClass implements Defaultable {


    public static void main(String[] args) {
        // Instantiate the current class.
        DefaultClass dc = new DefaultClass();

        // Call method directly..
        dc.abstractMethod();
    }

    // Method has a parameter of type Defaultable
    public void callAbstractMethod(Defaultable d) {
        // Execute implementing object's abstractMethod
        d.abstractMethod();
    }
    public void abstractMethod() {
        // Which method is this from (interface or BaseClass?)
        defaultNotAbstractMethod();
    }

}

/**
 Testing defaultNotAbstractMethod on class
 */