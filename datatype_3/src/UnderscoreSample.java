public class UnderscoreSample {
    public static void main(String[] args) {
        int a = 1____2;
        int b = 100_100_100;
     /*   int c = 50_____; ERROR !!!
        int e = ___50;   ERROR!!!*/

        short s = 1_____2;
        double d = 1_000_000_000.1;
        float f = 123.76_86f;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("s = " + s);
        System.out.println("d = " + d);
        System.out.println("f = " + f);

    }
}
