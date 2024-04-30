import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

/**
 * i read the Commedia of Dante with the Hybrid version of object
 *  Because I use Files.newImputStream
 */
public class MyFilesManagementWriteHybrid {

    public static void main(String[] args) {
        String fileName = "dante_commedia.txt";
        String copyFileName = "copia_dante_commedia.txt";
        Path copyOfCommedia = Path.of(copyFileName);
        byte[] lines = null;
        //I read an old file with the text I want to write into the new file one
        // and I put all the verses into an array of byte
        try {
            lines = Files.readAllBytes(Path.of(fileName));
        }catch(Exception e){
            e.printStackTrace();
        }
        String line;
        int count=0;
        try{
            OutputStream writer = new BufferedOutputStream(Files.newOutputStream(copyOfCommedia, StandardOpenOption.CREATE));
            writer.write(lines,0, lines.length);
            System.out.println("file copied ");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
