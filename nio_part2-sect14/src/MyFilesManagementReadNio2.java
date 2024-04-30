import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * i read the Commedia of Dante with Path and Files
 */
public class MyFilesManagementReadNio2 {

    public static void main(String[] args) {
        String fileName = "dante_commedia.txt";
        Path commedia = Path.of(fileName);
        String line;
        int count=0;
        try{
            BufferedReader reader = Files.newBufferedReader(commedia);
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
