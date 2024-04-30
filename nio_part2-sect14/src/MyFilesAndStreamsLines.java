import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;


//search all the instance of the words mena into the Dante's commedia
public class MyFilesAndStreamsLines {
    public static void main(String[] args) {
        Path commedia = Paths.get("dante_commedia.txt");

        try (Stream<String> commediaStream = Files.lines(commedia)) {
            commediaStream.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(e);
        }

        try (Stream<String> commediaStream = Files.lines(commedia)) {
            commediaStream.filter(l -> l.contains("maestro"))
                    .map(s -> s)
                    .forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
