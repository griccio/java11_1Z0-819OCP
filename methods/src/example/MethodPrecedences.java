package example;

public class MethodPrecedences {

//    public static long add (int a, int b){
//        System.out.println("inside int + int");
//        return a+b;
//    }

    public static long add (int a, int... b){
        System.out.println("inside int + varargs int");
        for(int val : b){
            a += val;
        }
        return a;
    }

    public static long add (int a, Integer b){
        System.out.println("inside int + Integer");
        return a + b.intValue();
    }


    public static long add (int a, Number b){
        System.out.println("inside int + Number");
        return a + b.intValue();
    }


    public static void main(String[] args){
        long l = MethodPrecedences.add(1,1);

//         l = MethodPrecedences.add(1,new Integer(10));

    }

}
