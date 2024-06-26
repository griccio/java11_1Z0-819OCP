/*
The Learn Programming Academy
Java SE 11 Developer 1Z0-819 OCP Course - Part 2
Section 4: Generics and Collections
Topic:  Using  wrapper classes, operators
*/

public class WrapperOperators {
    public static void main(String[] args) {

        Integer i = 10;
        short j = 10;

        // A wrapper used in most operations is unboxed prior to the 
        // operation

        // result of a wrapper and primitive can be assigned to a primitive
        // variable
        int intResult = i + j;

        // result of a wrapper and primitive can be assigned to a wrapper
        // variable
        Integer integerResult = i + j;

        // result of a wrapper and primitive can be assigned to a 
        // LVTI variable using var
        var result = i + j;

        System.out.println("intResult (type int) = " + intResult);
        System.out.println("integerResult (type Integer) = " + integerResult);
        System.out.println("result (LVTI) = " + result);

        short s1=10;
        short s2 = 100;
        Short s3 = Short.valueOf("10");
        Short s4 = Short.valueOf("10");
//        Short s5 = (Short) (s4 + s3); //Compile Error

        short shortResult = (short) (s1+s2);
//        Short shortWrapperResult = i + j;//Compile Error

    }
}