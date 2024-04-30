import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

/**
 * i want to create a list of automobile manufacturers
 * and write it to a file called manufacturer.txt
 */
public class MyFilesManagementCreate {

    public static void main(String[] args) {

        try{
            Path manufacturersFile = Path.of("manufacturers.txt");
            List<String> manufacturers = List.of(new String[]{"MERCEDES","PORSCHE","RANGE ROVER",
                    "FERRARI","MASERATI","BMW"});

            Files.write(manufacturersFile,manufacturers,StandardOpenOption.CREATE,StandardOpenOption.APPEND);
            System.out.printf("file %s created correctly\n",manufacturersFile);

            //Add a new manufacturer
            String newManufacturer = "\nROLLS ROYCE";
            Files.writeString(manufacturersFile,newManufacturer,StandardOpenOption.WRITE,StandardOpenOption.APPEND);
            System.out.printf("file %s new manufacturer added\n",newManufacturer);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
