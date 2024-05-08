
class MyOuterClass{
    int x =10;
    public void printInnerValue(){
        MyInnerPrivateClass myInnerClass = new MyInnerPrivateClass();
        System.out.println("InnerClass value is " + myInnerClass.y);
        System.out.println("Outer value is " + x);
    }

    private class MyInnerPrivateClass{
        int y = 100;
    }

    public class MyInnerPublicClass{
        int y = 100;
    }
}
public class MyNestedClass {
    public static void main(String[] args) {
        MyOuterClass myOuterClass = new MyOuterClass();
        myOuterClass.printInnerValue();
//       MyOuterClass.MyInnerPrivateClass  //this is an error because MyInnerPrivateClass has a privateAccess
        MyOuterClass.MyInnerPublicClass myInnerPublicClass = myOuterClass.new MyInnerPublicClass();
        System.out.println(myInnerPublicClass.y);
    }
}
