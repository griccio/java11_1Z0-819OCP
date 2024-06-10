package mysample.pkga;

public class A {
    int packageInt;
    protected int protectedInt;
    public int publicInt;
     public A(){
        System.out.println("This is super class A");
    }
    public A(String s){
        System.out.println("This is super class A single param constructor");
    }

    void packageMethod(){}
    public void publicMethod(){}
    protected void protectedMethod(){}
    public static void staticMethod(){}

}
