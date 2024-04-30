import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class MyFilesManagementCopy {
    
    public static void main(String[] args) {

         //copy c and its content into D
         //testD is created but files are not added
        try{
            Path source = Path.of("testA/testB/testC");//this path exist
            Path dest = Path.of("testA/testB/testD"); //this path doesn't exist
            Path result = Files.copy(source,dest, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("A.  Directory copied successfully: " +
                    source + " -> " + result);
            Files.deleteIfExists(dest);
            System.out.println(dest + "deleted successfully");
        } catch (IOException io) {
            System.out.println("A. Unable to copy Directory to source: " + io);
        }

        //copy the dir and its files
        try{
            Path source = Path.of("testA/testB/testC/hello.txt");
            //copy the dir
            Files.copy(Paths.get("TestA/testB/testC"),
                    Paths.get("TestA/testB/testD"),
                    StandardCopyOption.REPLACE_EXISTING);
            //copy the files
            Path dest = Path.of("testA/testB/testD/copyHello.txt");
            Path result = Files.copy(source,dest, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("B.  Directory copied successfully: " +
                    source + " -> " + result);
            //remove dest in order to do other test
            //I cannot remove a folder if there are some stuff
            Files.delete(dest); // first I remove the file
            Files.delete(Paths.get("TestA/testB/testD"));//I remove the folder
            System.out.println(dest + "and its content was deleted successfully");
        } catch (IOException io) {
            System.out.println("B.  Unable to copy Directory to source: "
                    + io);
        }


    }
}

/**

 */
