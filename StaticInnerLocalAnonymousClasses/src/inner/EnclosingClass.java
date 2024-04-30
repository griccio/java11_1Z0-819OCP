/*
        The Learn Programming Academy
        Java SE 11 Developer 1Z0-819 OCP Course - Part 2
        Section 1: Java Fundamentals
        Topic 2: Nested Classes
        Subtopic: Static Nested Classes
        */
package inner;

// Enclosing Class
public class EnclosingClass {
    //add constructor
    EnclosingClass(String name){
        this.outerName = name;
    }
    // instance field on enclosing class
    public String outerName = "outer";
    public InnerMemberClass innerMemberClass = new InnerMemberClass();

    // instance method on enclosing class
    public void doSomethingOnInstance() {
        System.out.println("doSomethingOnInstance invoked.");
        // invoke nested class's method via instance reference
        System.out.println(new InnerMemberClass().getInstanceName());
    }
    // Begin declaration of inner member class named InnerMemberClass
    public class InnerMemberClass {
        // instance field
        public String instanceName = "InnerMemberClass.instanceName";
        // instance method
        public String getInstanceName() {
            return "getInstanceName() = " + this.instanceName;
        }
        //With Shadowing
//        public String getOuterName() {
//            return "getInstanceName() = " + outerName;
//        }
        //eliminate Shadowing
        public String getOuterName() {
            return "getInstanceName() = " + EnclosingClass.this.outerName;
        }
        public String outerName = "inner";
    }  // Ends declaration of the inner member class

}
// This class tests the EnclosingClass and it's nested class
// from disassociated class.
class TestEnclosingClass {
    public static void main(String[] args) {
        EnclosingClass e = new EnclosingClass("e' EnclosingClass");
        e.doSomethingOnInstance();
        EnclosingClass.InnerMemberClass i = (new EnclosingClass("i's EnclosingClass'")).new InnerMemberClass();
        EnclosingClass.InnerMemberClass ii = e.new InnerMemberClass();
        //access to inner member of the Inner Class
        System.out.println(i.getOuterName());
        System.out.println(ii.getOuterName());
    }
}