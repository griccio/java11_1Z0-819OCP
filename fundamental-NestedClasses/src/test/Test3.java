package test;

class MyMultiInitializerClass{
    {
        System.out.println(" initializer block");
    }
    static{
        System.out.println("initializer static block");
    }
    MyMultiInitializerClass(){
        System.out.println("this is the constructor");
    }
}
public class Test3 {
    public static void main(String[] args) {
        MyMultiInitializerClass m1 = new MyMultiInitializerClass();
        var m2 = new MyMultiInitializerClass();
    }
}
/**
 initializer static block
 initializer block
 this is the constructor
 initializer block
 this is the constructor
 */