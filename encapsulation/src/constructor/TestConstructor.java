package constructor;

 class A {
     A() {
         System.out.println("inside A()");
     }

     A(int i) {
         System.out.println("inside A(int)");
     }
 }
    class B extends A{
         B(){
             super(0);
            System.out.println("inside B()");
        }
        B(int i){
            System.out.println("inside B(int)");
        }
    }

    public class TestConstructor{
         public static void main(String[] args) {
            B b = new B(10);
             B b2 = new B();
         }
     }

/**
 inside A()
 inside B(int)
 inside A()
 inside B()
 */
