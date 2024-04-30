public class MyWrapperSamples {
    static Integer d; //default is null
    public static void main(String[] args) {
        //example to demonstrate the immutability  of a Wrapper
        Integer a = 10; //autoBoxing
        Integer c = a; // c = 10

        c= 40; //c change but not a
        System.out.println("a =  " + a);
        System.out.println("c =  " + c);
        System.out.println("d =  " + d);

        //test static compare method
        char c1 = 'a';
        char c2 = 'b';
        char c3= 'z';
        //static comparison
        System.out.println("comparing 'a' with 'b' = " + Character.compare(c1,c2));
        System.out.println("comparing 'a' with 'z' = " + Character.compare(c1,c3));
        System.out.println("comparing 'z' with 'b' = " + Character.compare(c3,c2));
        System.out.println("comparing 'c' with 'a' = " + Character.compare('c','a'));
        System.out.println("comparing '1' with '6' = " + Character.compare('1','6'));

        //compareTo
        System.out.println("Character('a').compareTo('z') = " + Character.valueOf('a').compareTo('z'));//-25
        System.out.println("Character('z').compareTo('c') = " + Character.valueOf('z').compareTo('c'));//23
        Boolean b1 = Boolean.valueOf("TRUe");
        System.out.println("Boolean(true).compareTo(false) = " + b1.compareTo(false));//1
        Boolean b2 = Boolean.valueOf("FalsE");
        System.out.println("Boolean(false).compareTo(true) = " + b2.compareTo(true));//-1

        Integer i1 = 10;
        Integer i2 = 10;
/*
       //some errors
        i1.compareTo(null);//NullPointerException
        i1.compareTo(b2);//Compile Error Integer required
*/
        //equals
        System.out.println("Integer(10).equals(10) = " + i1.equals(10));//true
        System.out.println("Integer(10).equals(null) = " + i1.equals(null));//false
        System.out.println("Integer(10).equals(true) = " + i1.equals(b2));//false

        //parseInt, ParseBoolean
        int int1 = Integer.parseInt("100");
        //int int2 = Integer.parseInt(null); this throw an exception
        boolean bool1 =Boolean.parseBoolean("tRuE");//this method is case insensitive
        System.out.println("bool1 = " + bool1);

        //valueOf
        Float f = Float.valueOf(10);
        System.out.println("Float.valueOf(10) " +Float.valueOf(10));
        int i =10;
        System.out.println("Float.valueOf(i) " +Float.valueOf(i));

//       Integer i3 = Integer.valueOf(10f); //this is an error at compile time
        System.out.println("Integer.valueOf(10_000_000) " + Integer.valueOf(10_000_000));
        System.out.println("Integer.valueOf(\"10_000_000\") " + Integer.valueOf("10_000_000")); //this is an error at Runtime
        System.out.println("Integer.valueOf(10f) " + Integer.valueOf("10f")); //this is an error at Runtime
//        System.out.println("Integer.valueOf(10f) " + Integer.valueOf(10f)); //this is an error at Compile time

        System.out.println("Float.valueOf(i) " +Float.valueOf(i));

    }
}
