package lambdas;

import java.util.function.IntUnaryOperator;

public class Calculator {

    //We declare a functional interface as part of the class
    //a functional interface is an interface  with only one abstract method
    interface UnaryIntegerOperator{
        int calculate(int a);
    }

    public int calculate(int a, UnaryIntegerOperator op){
        return op.calculate(a);
    }

    public int calculate(int a, IntUnaryOperator op){
        return op.applyAsInt(a);
    }

    public static void main(String[] args){

        Calculator calc = new Calculator();

        UnaryIntegerOperator square = (int a) -> {return a*a;};
        UnaryIntegerOperator cube = a -> a*a*a;
        UnaryIntegerOperator increment = (a) -> a+1;
        UnaryIntegerOperator decrement = (int a) -> a-1;
        IntUnaryOperator add = (var a) -> a+a;

        System.out.println("Square of 10 is " +  + calc.calculate(10,square ));
        System.out.println("Cube of of 10 is " +  + calc.calculate(10,cube ));
        System.out.println("Increment of 10 is " +  + calc.calculate(10,increment ));

        System.out.println("Decrement of 10 is " +   calc.calculate(10, decrement));

        System.out.println("Add of 10 is " +   calc.calculate(10, add));

    }


}
