import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.Paths;
public class MyFilesManagementCreateDir {
    
    public static void main(String[] args) {
        //an exception is throws because files' path doesn't exist
        try{
            Path p = Path.of("A/B/C/D/file.txt");
            Files.createFile(p);
        }catch(Exception e){
            System.out.println(e);
        }
        //an exception is throws because path doesn't exist
        try{
            Path p = Path.of("A/B/C/D");
            Files.createDirectory(p);
        }catch(Exception e){
            System.out.println(e);
        }
        //everything is ok but file.txt is created as a dir
        try{
            Path p = Path.of("A/B/C/D/file.txt");
            Files.createDirectories(p);
            System.out.println(p + " was created");
        }catch(Exception e){
            System.out.println(e);
        }
        //it does what we want: a full path and a file at the end of the path
        try{
            Path p = Path.of("A/B/C/D/F");
            Files.createDirectory(p);
            System.out.println("dir " +  p + " was created");
            Path p2 = Paths.get("A/B/C/D/F/files.txt");
            Files.createFile(p2);
            System.out.println("file" + p2 + " was created correctly");

        }catch(Exception e){
            System.out.println(e);
        }
        //remove recursively the directory
        try{
            Path p = Path.of("A/B/C/D/F/files.txt");
            Files.deleteIfExists(p);//delete the file
            Files.deleteIfExists(Path.of("A/B/C/D/file.txt"));//delete the folder file.txt
           do{
              p = p.getParent();
              if(p != null) {
                  Files.delete(p);
                  System.out.println(p + " was deleted correctly ");
              }
           }while(p != null);
        }catch(Exception e){
            System.out.println(e);
        }

    }
}

/**
 java.nio.file.NoSuchFileException: A\B\C\D\file.txt
 java.nio.file.NoSuchFileException: A\B\C\D
 A\B\C\D was deleted correctly
 A\B\C was deleted correctly
 A\B was deleted correctly
 A was deleted correctly
 */
