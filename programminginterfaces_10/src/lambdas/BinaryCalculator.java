package lambdas;

public class BinaryCalculator {
    interface BinaryIntegerCalculator {
        int calculate(int a, int b);
    }

    int calculate(int a, int b, BinaryIntegerCalculator op) {
        return op.calculate(a, b);
    }

    public static void main(String[] args) {

        BinaryCalculator binCalc = new BinaryCalculator();

        BinaryIntegerCalculator add = (int a, int b) -> a + b;

        BinaryIntegerCalculator subtract = (a, b) -> {
            return (a - b);
        };

        BinaryIntegerCalculator multiply = (var a, var b) -> a * b;


        System.out.println("Add 10 to 20 is " + binCalc.calculate(10, 20, add));
        System.out.println("Times 10 to 20 is " + binCalc.calculate(10, 20, multiply));
        System.out.println("Subtract 10 to 20 is " + binCalc.calculate(10, 20, subtract));
    }

}
