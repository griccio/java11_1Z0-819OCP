import java.io.BufferedReader;
import java.io.FileReader;

/**
 * i read the Commedia of Dante with the old style used before the released of JDK7
 */
public class MyFilesManagementReadPreJDK7 {

    public static void main(String[] args) {
        String fileName = "dante_commedia.txt";
        String line;
        int count=0;
        try{
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
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
