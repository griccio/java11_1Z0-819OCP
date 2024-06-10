package test;

class A{
    int i= 10;
    A(int i){
        this.i = i;
    }


}
class B extends A{
    int j;
    B(){
        super(0);
        super.i=10;
        this.j=20;
    }
    B(int j){
        super(j);
        this.j = j;
    }
}
public class MySample {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.j + b.i);
    }
}
