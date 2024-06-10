package constructor;

class A2{
    public int sum(int a, int b){
        return a+b;
    }
}

class B2 extends A2{
    public int sum(int a, int b){
        return a*b;
    }
}
public class TestInheritance {
    public static void main(String[] args) {
        A2 a2 = new B2();

        System.out.println(a2.sum(10,2));
    }


}
