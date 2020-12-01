import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt
        getCharList();
    }

    public static List<Character> convertStringToCharList(String input) {
        List<Character> chars = new ArrayList<>();
        for (char ch : input.toCharArray()) {
            chars.add(ch);
        }
        return chars;
    }

    private static void getCharList() {
        try {
            Path filePath = Paths.get("duplicated-chars.txt");
            String input = Files.readString(filePath);
            List<Character> chars = convertStringToCharList(input);
            System.out.println(chars);

            for (int i = 0; i < chars.size(); i++) {
                int j = chars.get(i) + 1;
                if (i == j){
                    chars.add((char)i);
                }
            }
        } catch (Exception e) {
            System.out.println("not today");
        }
    }
}