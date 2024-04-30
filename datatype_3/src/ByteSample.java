public class ByteSample {
    public static void main(String[] args) {
        System.out.println("BYTE RANGE :" + Byte.MIN_VALUE  + " to " + Byte.MAX_VALUE );

        byte b1 = 10;
        byte b2 = 127; // this is ok because it within the range
        //byte b3 = 128; //this is a compile error
        int i=128;
        byte b3 = (byte)i; //this is overflow
        System.out.println(b3);

    }
}
