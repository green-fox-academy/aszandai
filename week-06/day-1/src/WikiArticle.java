import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WikiArticle {
    public static void main(String[] args) {
        Stream<String> lines;
        try {
            lines = Files.lines(Path.of("src/article.txt"));
            Set<String> words = lines
                    .flatMap((l) -> Stream.of(l.split("[.!?\\-;,\\s+\\(\\)]")))
                    .collect(Collectors.toSet());
            words.forEach(System.out::println);
            Map<String, Long> countWords = words.stream()
                    .collect(Collectors.groupingBy(String::toString, Collectors.counting()));
            System.out.println(countWords);
        } catch (IOException e) {
            System.out.println("File not found.");
            System.exit(2);
        }

    }
}
