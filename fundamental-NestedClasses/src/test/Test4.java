package test;

class Outer {
    public void print(int x) {
        class Inner {
            public void getX() {
                System.out.println(x);
            }
        }
        Inner inner = new Inner();
        inner.getX();
    }
}

public class Test4 {
    public static void main(String[] args) {
        new Outer().print(100);
    }
}