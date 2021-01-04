import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        cities.stream()
                .filter(s -> s.startsWith("A"))
                .forEach(System.out::println);

        // concatenate a Character list to a string
        List<Character> charactersToString = Arrays.asList('a', 'b', 'c', 'd', 'e');
        StringBuilder sb = new StringBuilder();
        charactersToString.forEach(sb::append);
        System.out.println(sb);

        // find the frequency of characters in a given string
        List<Character> charFrequency = Arrays.asList('a', 'a', 'a', 'x', 'b', 'c', 'd', 'e', 'a', 'b', 'e', 'x', 'y');
        Map<Character, Long> frequency = charFrequency.stream()
                .collect(Collectors.groupingBy(Character::charValue, Collectors.counting()));
        System.out.println(frequency);

    }
}
