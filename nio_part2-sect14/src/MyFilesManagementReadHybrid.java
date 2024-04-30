import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * i read the Commedia of Dante with the Hybrid version of object
 *  Because I use Files.newImputStream
 */
public class MyFilesManagementReadHybrid {

    public static void main(String[] args) {
        String fileName = "dante_commedia.txt";
        Path commedia = Path.of(fileName);
        String line;
        int count=0;
        try{
            InputStream inputStream = Files.newInputStream(commedia);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            while ((line = reader.readLine())!=null){
                System.out.println(line);
                count++;
            }
            System.out.println("number of line: " + count);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
