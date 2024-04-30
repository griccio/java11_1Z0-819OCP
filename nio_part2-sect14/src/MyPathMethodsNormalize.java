import java.nio.file.Path;
import java.nio.file.Paths;

public class MyPathMethodsNormalize {
    public static void main(String[] args) {
        Path p1 = Paths.get("/a/b/c/d/../../z");
        System.out.println("p1= " + p1);
        System.out.println("p1.normalize() (expected: a\\b\\z) " + p1.normalize());

        Path p2 = Paths.get("\\a\\b\\z");
        System.out.println("p2 " +p2.normalize());

        System.out.println("p1 == p2 false " +p1.equals(p2));
        System.out.println("p1 == p2 true  "
                + p1.normalize().equals(p2.normalize()));

        Path p3 = Paths.get("./a");
        System.out.println(p3 + " => " + p3.normalize());
        System.out.println("p3 is unchanged " + p3);

        Path p4 = Paths.get(".\\a");
        System.out.println(p4 + " => " + p4.normalize());

        System.out.println("p3 = p4  "
                + p3.normalize().equals(p4.normalize()));

        Path p5 = Paths.get("\\a");
        System.out.println(p5 + " => " + p5.normalize());

        System.out.println("p4 == p5 "
                + p4.normalize().equals(p5.normalize()));
        //p6 cannot be normalized
        Path p6 = Paths.get("../../../x/y/z");
        System.out.println(p6 + " => " + p6.normalize());
    }
}
/**
 p1= \a\b\c\d\..\..\z
 p1.normalize() (expected: a\b\z) \a\b\z
 p2 \a\b\z
 p1 == p2 false false
 p1 == p2 true  true
 .\a => a
 p3 is unchanged .\a
 .\a => a
 p3 = p4  true
 \a => \a
 p4 == p5 false
 ..\..\..\x\y\z => ..\..\..\x\y\z
 Process finished with exit code 0
 */