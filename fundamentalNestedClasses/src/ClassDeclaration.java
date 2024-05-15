
/*
//Error
protected class SampleA {}
private class sampleB {}
static class SampleT{}
*/
final class SampleE{}
abstract class SampleW{}
class K{};
final class KK extends K{
     public static final void  method1(){}
    public static  void  method2(){}
};
//this class with a private contructor is like a final
//because I cannot istantiate it with new
class KK2 extends K{
    private KK2(){}
    public static final void  method1(){}
    public static  void  method2(){}
};

public  final class ClassDeclaration {
    protected abstract class SampleA {}

    private final class sampleB {}
/*
//Error  cannot declare a final abstract
    protected final abstract class SampleC {}
    static final class SampleY{}
*/
    public static void main(String[] args) {
        System.out.println("Hello world!");
        KK.method1();
//        KK2 kk2 = new KK2();
        KK2.method1();
    }
}