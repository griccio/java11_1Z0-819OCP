package lambdas;

public class AnonymousTest {


    interface Helloable{
        void hello();
    }

    public static void main(String[] args){

        //We declare anonymous inner local named class
        class LocalClass extends Object{
            public void hello(){
                System.out.println("Hello I'm a local inner named class");
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.hello();



        //We create a local anonymous inner class
        //as a statement not a declaration
        Object myLocalAnonymousClass = new Object() {
            public String toString(){
                return "Hello I'm a local inner named class";
            }
        };
//        myLocalAnonymousClass.hello();



        Helloable helloInterface = new Helloable() {
            @Override
            public void hello() {
                System.out.println("Hello I'm a anonymous class that instantiate an Interface");
            }
        };

        helloInterface.hello();

        AnonymousTest a = new AnonymousTest();

        a.printHello(new Helloable() {
            @Override
            public void hello() {
                System.out.println("Hello Anonimous Class passed as parameter");
            }
        });

        a.printHello(() -> System.out.println("Hello I'm a Lambda Expression"));


    }
    public void printHello (Helloable hello){
        hello.hello();
    }

}
