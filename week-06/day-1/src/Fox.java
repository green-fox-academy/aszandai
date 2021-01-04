import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fox {
    String name;
    String color;
    Integer age;

    public Fox(String name, String color, Integer age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Integer getAge() {
        return age;
    }

    public static void main(String[] args) {
        List<Fox> foxList = Arrays.asList(
                new Fox("Bob", "green", 8),
                new Fox("Jack", "blue", 2),
                new Fox("Jane", "pink", 7),
                new Fox("Mary", "pink", 3),
                new Fox("John", "green", 6),
                new Fox("Timmy", "green", 1),
                new Fox("Billy", "green", 2),
                new Fox("Mike", "violet", 5),
                new Fox("Don", "violet", 9)
        );

        // Write a Stream Expression to find the foxes with green color!
        List<String> greenFoxes = foxList.stream()
                .filter(fox -> fox.getColor().equals("green"))
                .map(Fox::getName)
                .collect(Collectors.toList());
        System.out.println(greenFoxes);

        // Write a Stream Expression to find the foxes with green color, and age less then 5 years!
        List<String> greenAndYoung = foxList.stream()
                .filter(fox -> fox.getColor().equals("green") && fox.getAge() < 5)
                .map(Fox::getName)
                .collect(Collectors.toList());
        System.out.println(greenAndYoung);

        // Write a Stream Expression to find the frequency of foxes by color!
        Map<String, Long> foxFrequency = foxList.stream()
                .collect(Collectors.groupingBy(fox -> fox.getColor(), Collectors.counting()));
        System.out.println(foxFrequency);
        
    }
}
