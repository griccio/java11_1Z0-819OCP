
/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 8: Applying Encapsulation
Topic: Applying Access Modifiers
*/

package pkga;

class PackageAClass {
    void testAccess() {
        SuperClass c = new SuperClass();
        System.out.println("A non-subclass class has access to all but " +
                "private fields of another class in same package");

        System.out.println("- SuperClass().publicInt = "
                + c.publicInt);

        System.out.println("- SuperClass().packageInt = "
                + c.packageInt);

        System.out.println("- SuperClass().protectedInt = "
                + c.protectedInt);


    }
}

public class SuperClass {
    public int publicInt = 10;
    int packageInt = 20;
    protected int protectedInt = 30;
    private int privateInt = 40;

    public static void main(String[] args) {
        new SuperClass().testAccess();
        new PackageAClass().testAccess();
    }

    void testAccess() {
        System.out.println(this.getClass().getName() +
                " has access to all of its own attributes:");
        System.out.println("- this.publicInt = " + this.publicInt);
        System.out.println("- this.packageInt = " + this.packageInt);
        System.out.println("- this.protectedInt = " + this.protectedInt);
        System.out.println("- this.privateInt = " + this.privateInt);
    }
}
/**
 pkga.SuperClass has access to all of its own attributes:
 - this.publicInt = 10
 - this.packageInt = 20
 - this.protectedInt = 30
 - this.privateInt = 40
 A non-subclass class has access to all but private fields of another class in same package
 - SuperClass().publicInt = 10
 - SuperClass().packageInt = 20
 - SuperClass().protectedInt = 30
 */