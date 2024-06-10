package test;

class Greet {
    public void sayHello() {
        System.out.println("Hello!");
    }

    class Hello{
        public void sayHello(){

        }
    }
}


public class Test {
    public static void main(String[] args) {
        var obj = new Greet() {
          public String hello = "HELLO!!!";
            @Override
            public void sayHello() {
                SayHello();
            }
            public void SayHello() {
                System.out.println(hello);
            }
            public void Hello() {
                System.out.println("HELLO!!!");
            }
        };
        obj.Hello();
    }
}