package myexample;

 interface Test{
     public static Integer counter = null;
     void privateMethod();
     private void privateMethod2(){};
 }

 abstract class MyAbstractClass{
      abstract void privateMethod();
      protected abstract void protectedMethod();
     private void privateMethod2(){};

     public abstract void publicMethod();

 }

public class Test01 {

}
