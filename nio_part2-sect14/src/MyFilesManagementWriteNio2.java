import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * i read the Commedia of Dante with Path and Files
 */
public class MyFilesManagementWriteNio2 {

    public static void main(String[] args) {
        String fileName = "dante_commedia.txt";
        String copyFileName = "copia_dante_commedia.txt";
        Path copyOfCommedia = Path.of(copyFileName);
        List<String> lines = new ArrayList<>();
        //I read an old file with the text I want to write into the new file one
        // and I put all the verses into a list of String
        try {
            lines = Files.readAllLines(Path.of(fileName));
        }catch(Exception e){
            e.printStackTrace();
        }
        int count=0;
        try{
            BufferedWriter writer  = Files.newBufferedWriter(copyOfCommedia);
            for(String line: lines){
                writer.write(line);
                writer.newLine();
                count++;
            }
            System.out.println("number of line: " + count);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
