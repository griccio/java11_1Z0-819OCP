public class TestAbstrctClass {
    public static void main(String[] args) {
        Greet obj = new Greet() {
            public void SayHello() {
                System.out.println("HELLO!");
            }
            public void hello() {
                System.out.println("HELLO!");
            }
        };
        obj.sayHello();
    }
}

class Greet {
    public void sayHello() {
        System.out.println("Hello!");
    }
}

