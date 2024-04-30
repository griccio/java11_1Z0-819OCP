public class PrimitiveDataType {

    public static void main(String[] args){
        int i = 10;
        int i2 = 20;
        int i3 = i;
        System.out.println("i= " + i);
        System.out.println("i2= " + i2);
        System.out.println("i3= " + i3);
        i3 =30;
        add(i3);
        System.out.println("i= " + i);
        System.out.println("i2= " + i2);
        System.out.println("i3= " + i3);

        Integer int1 = 10;
        Integer int2 = 20;
        Integer int3 = int1;
        System.out.println("int1= " + int1);
        System.out.println("int2= " + int2);
        System.out.println("int3= " + int3);

        int1 = 30;
        add(int2);

        System.out.println("int1= " + int1);
        System.out.println("int2= " + int2);
        System.out.println("int3= " + int3);

        double d =123;
        float f =123;
        int ii;
        long l2;
        d = f;
//        f = d;
        d=0;
        f=0;

//        ii = f;
//        ii=d;
    }
    public static void add(Integer i){
        i+=1;
    }
    public static void add(int i){
        i+=1;
    }
}
