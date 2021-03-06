import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        // Write a function that takes a filename as string,
        // then returns the number of lines the file contains.
        // It should return zero if it can't open the file, and
        // should not raise any error.

        try {
            Path filePath = Paths.get("my-file.txt");
            List<String> fileName = Files.readAllLines(filePath);
            System.out.println(fileName.size());
        } catch (IOException e) {
            System.out.println(0);
        }
    }
}
