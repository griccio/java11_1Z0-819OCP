import java.nio.file.Path;
import java.nio.file.Paths;

public class MyPathMethodsOther {
    public static void main(String[] args) {
        Path p1 = Paths.get("begin\\a\\b\\c\\d\\fin");
        System.out.println(p1);

        System.out.println("p1.start "+ p1.startsWith("begin"));
        System.out.println("p1.end =  " + p1.endsWith( "fin"));


        Path p2 = Paths.get("a/b/c");
        Path p3 = Paths.get("a/b/c");
        System.out.println("p2 compare p3 = " + p2.compareTo(p3));

        System.out.println(p1.resolveSibling(p2));
    }
}

/**
 begin\a\b\c\d\fin
 p1.start true
 p1.end =  true
 p2 compare p3 = 0
 begin\a\b\c\d\a\b\c
 Process finished with exit code 0
 */
