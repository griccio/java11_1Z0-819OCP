/*
The Learn Programming Academy
Java SE 11 Developer 1Z0-819 OCP Course - Part 2
Section 4: Generics and Collections
Topic:  Generics, create a generic class
*/

// Declaring non-generic or 'raw' type.
class SpecificallyTypedClass {

    // instance variable
    Object currentObj;

    // Constructor
    SpecificallyTypedClass(Object o) {
        this.currentObj = o;
        printType();
    }

    // instance method
    public void printType() {
        System.out.println("Instance variable type is Object, but " +
                "runtime type = " + this.currentObj.getClass().getName());
    }
}

// Declaring a generic class
class GenericallyTypedClass<T> {

    // Declaring an instance variable using type parameter
    T currentObj;

    // Constructor allows passing an object to the Generic class
    // using the type parameter T
    GenericallyTypedClass(T t) {
        this.currentObj = t;
        printType();
    }

    // instance method
    public void printType() {
        System.out.println("Instance variable type is T but compile" +
                " time type = " + this.currentObj.getClass().getName());
    }
}

public class TestGenerics {

    public static void main(String[] args) {

        // Declare and instantiate different instances of non-generic class
        SpecificallyTypedClass raw1 = new SpecificallyTypedClass("hello");
        SpecificallyTypedClass raw2 =
                new SpecificallyTypedClass(new StringBuilder("hello"));
        SpecificallyTypedClass raw3 = new SpecificallyTypedClass(10);

        // Declare and instantiate different instances of generic class

        // Declare type argument <String> on both sides of
        // assignment operator
        GenericallyTypedClass<String> generic1 =
                new GenericallyTypedClass<String>("hello");

        // Declare type argument <StringBuilder> on left side of assignment,
        // use <> diamond operator on right side
        GenericallyTypedClass<StringBuilder> generic2 =
                new GenericallyTypedClass<>(new StringBuilder("hello"));

        // Declare a LVTI (var), and specify type argument on right side of
        // assignment using  <Integer>
        var generic3 = new GenericallyTypedClass<Integer>(10);

        GenericallyTypedClass<Long> generic4 = new GenericallyTypedClass<Long>(1000L);
 /*
        Object myobj = generic4.currentObj;
        Integer int3 = (Integer)myobj;
        Integer l3 = generic3.currentObj;
        Integer i3 = generic4.currentObj;
*/
    Integer i =10;
    Long l = 10l;
/*

     Object obj1 = raw1.currentObj;
        String str = (String)obj1;
        StringBuilder sb = (StringBuilder)obj1; //RuntimeException

*/
/*

        String str2 = generic1.currentObj;
        StringBuilder sb2 = (StringBuilder)obj2; //RuntimeException

        String s2 = generic1.currentObj;
        GenericallyTypedClass<int> generic4 =
                new GenericallyTypedClass<int>(10);
*/

    }
}
/*
    Instance variable type is Object, but runtime type = java.lang.String
        Instance variable type is Object, but runtime type = java.lang.StringBuilder
        Instance variable type is Object, but runtime type = java.lang.Integer
        Instance variable type is T but compile time type = java.lang.String
        Instance variable type is T but compile time type = java.lang.StringBuilder
        Instance variable type is T but compile time type = java.lang.Integer
        Instance variable type is T but compile time type = java.lang.Long
*/
