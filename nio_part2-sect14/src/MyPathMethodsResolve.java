import java.nio.file.Path;
import java.nio.file.Paths;

public class MyPathMethodsResolve {
    public static void main(String[] args) {
        Path absolute = Paths.get("C:\\Users\\Giuseppe\\sviluppo\\1Z0-819\\java11_1Z0-819OCP");
        Path relative = Path.of("nio2");
        Path file = Path.of("name.txt");
        // Absolute resolve
        System.out.println(absolute.resolve(relative));
        System.out.println(absolute.resolve(file));
        System.out.println(relative.resolve(file));
        System.out.println(absolute.resolve(relative).resolve(file));
        //resolve absolutePath within relative path, absolute path is returned
        System.out.println(relative.resolve(absolute));
        System.out.println(relative.resolve(absolute).resolve(file));
        System.out.println(absolute.resolve(absolute));

    }
}
/**
 C:\Users\Giuseppe\sviluppo\1Z0-819\java11_1Z0-819OCP\nio2
 C:\Users\Giuseppe\sviluppo\1Z0-819\java11_1Z0-819OCP\name.txt
 nio2\name.txt
 C:\Users\Giuseppe\sviluppo\1Z0-819\java11_1Z0-819OCP\nio2\name.txt
 C:\Users\Giuseppe\sviluppo\1Z0-819\java11_1Z0-819OCP
 C:\Users\Giuseppe\sviluppo\1Z0-819\java11_1Z0-819OCP\name.txt
 C:\Users\Giuseppe\sviluppo\1Z0-819\java11_1Z0-819OCP
 Process finished with exit code 0
 */