package local;
/*
The Learn Programming Academy
Java SE 11 Developer 1Z0-819 OCP Course - Part 2
Section 1: Java Fundamentals
Topic:  Local Classes
*/

public class LocalClassExample {
    // Creating a non-static method that declares a local class
    private String defaultName = "Jane";
    private String defaultLastName = "Doe";
    private void methodWithLocalClass() {


        // LocalClass Only has scope within this method
        class LocalClass {
            // local class can have all the same members as an outer class
            // (with the exception of static members).
            String name;
            String defaultName="Joe";

            // Constructor on local class
            LocalClass(String name) {
                this.name = name;
            }

            void performSomeAction() {
                if(name == null || name.isEmpty())
                   this.name = defaultName;
                System.out.println("LocalClass.name = " + name + " "+ defaultLastName);

            }
        }

        // Create multiple instances of local class within
        // the enclosing code's scope..
        LocalClass jeff = new LocalClass("Jeff");
        LocalClass martha = new LocalClass("Martha");
        LocalClass bob = new LocalClass("Bob");
        LocalClass emptyName = new LocalClass(null);

        // Execute methods on instances of the local class
        jeff.performSomeAction();
        martha.performSomeAction();
        bob.performSomeAction();
        emptyName.performSomeAction();

        emptyName.name = "Joseph";
        emptyName.performSomeAction();


        // Access fields directly from instance of local class
        System.out.println("Bob's name is: " + bob.name);
        System.out.println("default LastName: " + LocalClassExample.this.defaultLastName);
        System.out.println("SuperClass default lastName is: " + this.defaultLastName);
    }

    public static void main(String[] args) {
        new LocalClassExample().methodWithLocalClass();
    }
}