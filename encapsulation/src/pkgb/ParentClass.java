/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 8: Applying Encapsulation
Topic: Applying Access Modifiers
*/

package pkgb;

import pkga.SuperClass;

class PackageBClass {
    void testAccess() {
        SuperClass c = new SuperClass();
        System.out.println("A non sub-class class in a different package" +
                " has access only to a public class's public fields ");
        System.out.println("- SuperClass().publicInt = " + c.publicInt);
    }
}

public class ParentClass extends SuperClass {
    public static void main(String[] args) {
        new PackageBClass().testAccess();
        new ParentClass().testAccess();
    }

    void testAccess() {
        System.out.println(this.getClass().getName() +
                " has access to only it's parent's public and protected" +
                " attributes if it's declared in another package:");
        publicInt = 1000;
        protectedInt = 2000;
        System.out.println("- this.publicInt = " + this.publicInt);
        System.out.println("- this.protectedInt = " + this.protectedInt);

        // You can use the word super to get at it too, but superfluous
        // in this context
        System.out.println("- super.protectedInt = " + super.protectedInt);

        System.out.println("- new instance access to protected = " + new ParentClass().publicInt);
        System.out.println("- new instance access to protected = " + new ParentClass().protectedInt);
//        // What happens if you access through instance of SuperClass here?
//        System.out.println("- new SuperClass().protectedInt = "
//                + new SuperClass().protectedInt);

        // What happens if you access through instance of SuperClass here?
        System.out.println("- new SuperClass().protectedInt not available" +
                " through SuperClass instance in " +
                this.getClass().getName());

    }
}

/**
 A non sub-class class in a different package has access only to a public class's public fields
 - SuperClass().publicInt = 10
 pkgb.ParentClass has access to only it's parent's public and protected attributes if it's declared in another package:
 - this.publicInt = 10
 - this.protectedInt = 30
 - super.protectedInt = 30
 - new instance access to protected = 10
 - new instance access to protected = 30
 - new SuperClass().protectedInt not available through SuperClass instance in pkgb.ParentClass
 */