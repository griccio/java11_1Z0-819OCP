

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * list the files and dirs of the current dir
 * and write the result to a file.
 * Files.list return a Stream of path
 * and you have to transform the List<Path> into a List<String>
 */
public class MyFilesAndStreamsListAndWalk {

    public static void main(String[] args) {
        Path currentWorkingDir = Path.of("");
        try {
            List<String> dirs = Files.list(currentWorkingDir)
                    .filter(p -> Files.isDirectory(p))
                    .map(p ->p.toString())
                    .collect(Collectors.toList());

            Files.write(Path.of("dir.txt"),dirs, StandardOpenOption.CREATE);
        } catch (Exception e) {
            System.out.println(e);

        }
        try {
            List<String> dirs = Files.list(currentWorkingDir)
                    .filter(p -> Files.isRegularFile(p))
                    .map(p ->p.toString())
                    .collect(Collectors.toList());
            //remember: if StandardOpenOption.CREATE_NEW and the file already exist
            // you have a java.nio.file.FileAlreadyExistsException: files.txt
            Files.write(Path.of("files.txt"),dirs, StandardOpenOption.CREATE);
        } catch (Exception e) {
            System.out.println(e);
        }

        //show the difference between walk and list
        //walk
        System.out.println("--------Files walk");
        Path  out = Path.of("array_05");
        try(Stream<Path> str = Files.walk(out)){
            str.forEach(System.out::println);
        }catch(IOException e){
            System.out.println(e);
        }
        System.out.println("-----Files list");
        out = Path.of("array_05");
        try(Stream<Path> str = Files.list(out)){
            str.forEach(System.out::println);
        }catch(IOException e){
            System.out.println(e);
        }

    }
}
