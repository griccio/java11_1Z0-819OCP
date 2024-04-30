import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class MyFilesManagementMove {
    
    public static void main(String[] args) {
        //I have an exception
        try{
            Path source = Path.of("testA/testB/testC");//this path exist
            Path dest = Path.of("testG/testJ/TestK/TestY"); //this doesn't exist
            Path result = Files.move(source,dest, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("A.  Directory moved successfully: " +
                    source + " -> " + result);
        } catch (IOException io) {
            System.out.println("A. Unable to move Directory to source: " + io);
        }
        //this is OK, all files are moved, and testC removed
        try{
            Path source = Path.of("testA/testB/testC");//this path exist
            Path dest = Path.of("testG/testH/TestK"); //this path exist
            Path result = Files.move(source,dest, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("B.  Directory moved successfully: " +
                    source + " -> " + result);
        } catch (IOException io) {
            System.out.println("B. Unable to move Directory to source: " + io);
        }
        //all files are moved, TestC removed, and TestY created.
        try{
            Path source = Path.of("testA/testB/testC");//this path exist
            Path dest = Path.of("testG/testH/TestK/TestY"); //TestY doesn't exist
            Path result = Files.move(source,dest, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("C.  Directory moved successfully: " +
                    source + " -> " + result);
        } catch (IOException io) {
            System.out.println("C. Unable to move Directory to source: " + io);
        }
    }
}
/**
 A. Unable to move Directory to source:
 java.nio.file.NoSuchFileException: testA\testB\testC -> testG\testJ\TestK\TestY
 B.  Directory moved successfully: testA\testB\testC -> testG\testH\TestK
 C.  Directory moved successfully: testA\testB\testC -> testG\testH\TestK\TestY
 */
