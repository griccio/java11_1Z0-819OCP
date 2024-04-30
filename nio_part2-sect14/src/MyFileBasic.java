import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MyFileBasic {

    public static void main(String[] args) throws IOException {
        Path source = Path.of("myfile.txt");
        //verify existence
        System.out.println(source + " exists (no) " + Files.exists(source));
        System.out.println(source +" notExists (yes) " + Files.notExists(source));
        Path existPath = Paths.get("out\\production");
        System.out.println(existPath + " exists (yes) " + Files.exists(existPath));
        System.out.println(existPath + " notExists (no) " + Files.notExists(existPath));
        //existing file
        Path existingFile = Paths.get("characterData.txt");
        System.out.println("characterData.txt exists = " + Files.exists(existingFile));
        //more information about existing file
        System.out.println( existPath + " is a dir " + Files.isDirectory(existPath));
        System.out.println(existingFile + " is a file " + Files.isRegularFile(existingFile));
        System.out.println(existingFile + " is a readable file " + Files.isReadable(existingFile));
        System.out.println(existingFile + " is a exec file " + Files.isExecutable(existingFile));
        System.out.println(existingFile + " is a writable file " + Files.isWritable(existingFile));
        System.out.println(existingFile + " file size = " + Files.size(existingFile));
        System.out.println(existingFile + " last modified time = " + Files.getLastModifiedTime(existingFile));
    }
}
/**
 myfile.txt exists (no) false
 myfile.txt notExists (yes) true
 out\production exists (yes) true
 out\production notExists (no) false
 characterData.txt exists = true
 out\production is a dir true
 characterData.txt is a file true
 characterData.txt is a readable file true
 characterData.txt is a exec file true
 characterData.txt is a writable file true
 characterData.txt file size = 7363
 characterData.txt last modified time = 2024-03-29T11:04:36.312855Z
 Process finished with exit code 0
 */