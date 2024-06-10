package mysample.pkgb;

import mysample.pkga.A;

public class  B extends A {
    B(){
        System.out.println("This is sub class B");
    }
     B(String s){
        super(s);
        System.out.println("This is sub class B single param constructor");
    }

    public static void staticMethod(){}

    public void accessFields(){
        System.out.println("protectedInt " + protectedInt);
        System.out.println("publicInt " + publicInt);
    }

    public static void main(String[] args) {
        System.out.println("-------- b = new B()");
        B b= new B();
        System.out.println("-------- b = new B(\"Hello\")");
        B b2 = new B("Hello");
        System.out.println("--howto access fields and method");
        Object s = new String();
        if(s instanceof  Object)
            System.out.println("s is an object" );
        else
            System.out.println("No");

        if(s instanceof  String)
            System.out.println("s is a String" );

    }
}