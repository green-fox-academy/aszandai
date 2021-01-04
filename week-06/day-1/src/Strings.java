import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Strings {
    public static void main(String[] args) {
        String upperCaseChars = "This StrinG Is haVINg sOmE UPPERCASE charAcTers.".chars()
                .filter(Character::isUpperCase)
                .mapToObj(c -> Character.toString((char) c))
                .collect(Collectors.joining());

        System.out.println(upperCaseChars);

        // Write a Stream Expression to...
        // find the strings which starts with a given letter(as parameter), in the following list:
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");

        cities.stream().filter(s -> s.startsWith("A")).forEach(System.out::println);

    }
}
