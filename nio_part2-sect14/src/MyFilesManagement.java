import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class MyFilesManagement {

    public static void main(String[] args) {

//        //create a new File
//        //1create a Path
//        //create the file
//        Path path1 = Paths.get("giuseppe.txt");
//        try{
//            Files.createFile(path1);
//        }catch(IOException e){
//            e.printStackTrace();
//        }


//        try{
//            Path test = Path.of("testingFile.txt");
//            //use readAllLines read file
//            List<String> lines = Files.readAllLines(test);
//            lines.forEach(System.out::println);
//
//            //use readAllBytes
//            System.out.println("readAllByte");
//            byte[] byteArray = Files.readAllBytes(test);
//            System.out.println(new String(byteArray));
//
//        }catch(Exception e){
//            e.printStackTrace();
//        }

        //create file
        try{
            Path test = Path.of("testingFile.txt");
            List<String> lines = Files.readAllLines(test);
            // Use first line of previous file to create a new file
            Path byteFile = Path.of(lines.get(0).split("\\s")[1] + ".txt");

            System.out.println("Creating " + byteFile);
            // Write bytes to this file, creating a new file each time.

            try {
                // Exception occurs if file already exists
                Files.write(byteFile, "Secret sauce".getBytes(),
                        StandardOpenOption.CREATE_NEW);
            } catch (IOException e) {
                System.out.println(e);
                Files.write(byteFile, "Secret sauce".getBytes(),
                        StandardOpenOption.CREATE, StandardOpenOption.APPEND);

            }
        }catch(Exception e){
            e.printStackTrace();
        }






    }
}
