/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 2: Testing import statements
*/

// type-import-on-demand declaration
import garden.vegetable.*;
//import nursery.vegetable.VineVegetable;
public class TestImport {
    public static void main(String[] args) {

        // String class in the java.lang package, simple class name ok
        // no import statement required
        String s = "We are testing import statements";
        System.out.println(s);

        // We use simple name because we specified location in the import
        // statement
        VineVegetable.main(args);
        nursery.vegetable.VineVegetable.main(args);
    }
}

class VineVegetable {
    public static void main(String[] args) {
        System.out.println("I am a local VineVegetable");
    }
}