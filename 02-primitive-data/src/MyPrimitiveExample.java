public class MyPrimitiveExample {
    public static void main(String[] args) {
        int i = 10;
        byte b = 100;
        char c= 100;
        short s = 100;
        long l = 100;
        boolean b1=true, b2= false, b3;
        try {
            System.out.println("i=" +i);
            System.out.println("b=" +b);
            System.out.println("c=" +c);
            System.out.println("s=" +s);
            System.out.println("l=" +l);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        l= i = s = b;

        char c2 = (char)b;
        char c3 = (char)l;
        char c4 = (char)s;
        System.out.println("c2=" +c2);
        System.out.println("c3=" +c3);
        System.out.println("c4=" +c4);

    }
}
