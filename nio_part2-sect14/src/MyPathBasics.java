import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MyPathBasics {
    public static void main(String[] args) {
        Path cwd = Paths.get("");
        System.out.println("current working directory is " + cwd.toAbsolutePath());
        System.out.println("user dir is" + System.getProperty("user.dir"));
        //full path
        Path currentDir = Paths.get("\\Users\\Giuseppe\\sviluppo\\1Z0-819\\java11_1Z0-819OCP\\nio_part2-sect14");
        System.out.println("currentDir " + currentDir.toAbsolutePath());
        //mixing style
        Path currentDir2 = Paths.get("C:/Users","\\Giuseppe\\sviluppo","/1Z0-819/java11_1Z0-819OCP/nio_part2-sect14");
        System.out.println("currentDir2 " + currentDir2.toAbsolutePath());
        //varargs
        Path currentDir3 = Paths.get("C:", "Users","Giuseppe","sviluppo","1Z0-819","java11_1Z0-819OCP","nio_part2-sect14");
        System.out.println("currentDir3 " + currentDir3.toAbsolutePath());
        //URI
        Path currentDir4 = Paths.get(URI.create("file:///Users/Giuseppe/sviluppo/1Z0-819/java11_1Z0-819OCP/characterData.txt"));
        System.out.println("currentDir4 " + currentDir4.toAbsolutePath());
        //with Path.of
        Path currentDir1_1 = Path.of("C:/Users/Giuseppe/sviluppo/1Z0-819/java11_1Z0-819OCP/characterData.txt");
        System.out.println("currentDir1_1 " + currentDir1_1.toAbsolutePath());
        //PAth.of(varargs)
        Path currentDir1_2 = Path.of("C:", "Users","Giuseppe","sviluppo","1Z0-819","java11_1Z0-819OCP","nio_part2-sect14");
        System.out.println("currentDir1_2 " + currentDir1_2.toAbsolutePath());

        Path currentDir1_3 = FileSystems.getDefault().getPath("C:", new String[]{ "Users","Giuseppe","sviluppo","1Z0-819","java11_1Z0-819OCP","nio_part2-sect14"});
        System.out.println("currentDir1_3" + currentDir1_3.toAbsolutePath());


        //------------------------------
        // PATH INFO
        //----------------------------

        System.out.println("file name or dir name" + currentDir1_3.getFileName());
        System.out.println("file name or dir name" + currentDir4.getFileName());

        // Parent directory returned as a Path
        System.out.println("currentDir1_3.getParent() Parent Directory: " + currentDir1_3.getParent());

        // Get part of the path, using names
        System.out.println("currentDir4.subpath(0, 2) Getting subpath: " + currentDir4.subpath(0, 2));

        // Number of sub directories in the path
        System.out.println("Number of Sub-Directories: " +
                currentDir4.getNameCount() + "   [getNameCount()]");

// Root directory returned as a path
        System.out.format("%s   [getRoot()]: %n", currentDir4.getRoot());
        for (int i = 0; i < currentDir4.getNameCount(); i++) {
            for (int j = 0; j <= i; j++) System.out.print("\t");

            // Note that getName returns a Path object
            System.out.println("---> " + currentDir4.getName(i) +
                    "   [getName(" + i + ")]");
        }
    }
}
/*
current working directory is C:\Users\Giuseppe\sviluppo\1Z0-819\java11_1Z0-819OCP
user dir isC:\Users\Giuseppe\sviluppo\1Z0-819\java11_1Z0-819OCP
currentDir C:\Users\Giuseppe\sviluppo\1Z0-819\java11_1Z0-819OCP\nio_part2-sect14
currentDir2 C:\Users\Giuseppe\sviluppo\1Z0-819\java11_1Z0-819OCP\nio_part2-sect14
currentDir3 C:\Users\Giuseppe\sviluppo\1Z0-819\java11_1Z0-819OCP\nio_part2-sect14
currentDir4 C:\Users\Giuseppe\sviluppo\1Z0-819\java11_1Z0-819OCP\characterData.txt
currentDir1_1 C:\Users\Giuseppe\sviluppo\1Z0-819\java11_1Z0-819OCP\characterData.txt
currentDir1_2 C:\Users\Giuseppe\sviluppo\1Z0-819\java11_1Z0-819OCP\nio_part2-sect14
currentDir1_3C:\Users\Giuseppe\sviluppo\1Z0-819\java11_1Z0-819OCP\nio_part2-sect14
file name or dir namenio_part2-sect14
file name or dir namecharacterData.txt
currentDir1_3.getParent() Parent Directory: C:\Users\Giuseppe\sviluppo\1Z0-819\java11_1Z0-819OCP
currentDir4.subpath(0, 2) Getting subpath: Users\Giuseppe
Number of Sub-Directories: 6   [getNameCount()]
\   [getRoot()]:
	---> Users   [getName(0)]
		---> Giuseppe   [getName(1)]
			---> sviluppo   [getName(2)]
				---> 1Z0-819   [getName(3)]
					---> java11_1Z0-819OCP   [getName(4)]
						---> characterData.txt   [getName(5)]
Process finished with exit code 0
*/
