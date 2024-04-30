import java.nio.file.Path;
import java.nio.file.Paths;

public class MyPathMethodsRelativize {
    public static void main(String[] args) {
        Path p1 = Paths.get("cattle.txt"); //file doesn't exist
        Path p2 = Path.of("farm/horses.txt");// file doesn't exist
        System.out.println(p1.relativize(p2));
        System.out.println(p2.relativize(p1));
        Path p3 = Path.of("C:\\examples\\java\\nio2");
        Path p4 = Path.of("C:\\samples\\java");

        System.out.println(p3.relativize(p4)); // ../../../sample/java
        System.out.println(p4.relativize(p3)); // ../../examples/java/nio2

        System.out.println(p4.relativize(p2));//this throws an exception


    }

}
/**
 ..\farm\horses.txt
 ..\..\cattle.txt
 ..\..\..\samples\java
 ..\..\examples\java\nio2
 Exception in thread "main" java.lang.IllegalArgumentException: 'other' is different type of Path
 at java.base/sun.nio.fs.WindowsPath.relativize(WindowsPath.java:400)
 at java.base/sun.nio.fs.WindowsPath.relativize(WindowsPath.java:42)
 at MyPathMethodsRelativize.main(MyPathMethodsRelativize.java:16)

 Process finished with exit code 1
 */