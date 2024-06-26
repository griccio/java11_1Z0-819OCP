/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 8: Applying Encapsulation
Topic: Access Modifiers
Sub-Topic: Constructors
*/
package pkgtwo;

import pkgone.LevelTwoClass;

// Extends class from a different package
class LevelThreeClass extends LevelTwoClass {

    // package-private constructor
    LevelThreeClass() {
        this("good");
        System.out.println("package LevelThreeClass " +
                "no args constructor");
    }

    // private constructor
    private LevelThreeClass(String text) {
//        super();
        System.out.println("private LevelThreeClass " +
                "single params constructor");
    }
}

public class ConstructorAccess {
    public static void main(String[] args) {
        // The constructor test
        LevelThreeClass c = new LevelThreeClass();

    }
}