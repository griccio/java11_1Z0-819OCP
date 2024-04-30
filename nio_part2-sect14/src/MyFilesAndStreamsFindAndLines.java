
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;
public class MyFilesAndStreamsFindAndLines {
    public static void main(String[] args)  {
        // Check files, interested in those modified in last x hours
        int hrsToCheck = 72;
        // Translate into milliseconds
        int elapsedMs = hrsToCheck * 60 * 60 * 1000;
        // Get the current time in milliseconds
        long now = System.currentTimeMillis();
        Path workingDir= Path.of("");
        //search for file with name starting with "My"
        // and created into the last 72 hours
        try(Stream<Path> wkdStream = Files.find(workingDir,10,
                (p,a) ->{return (a.isRegularFile() &&
                                 p.getFileName().toString().startsWith("My") &&
                                 now - a.creationTime().toMillis() < elapsedMs );}
                )) {
            wkdStream.forEach((p) -> System.out.println(p));
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}