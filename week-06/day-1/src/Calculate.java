import java.util.Arrays;
import java.util.List;

public class Calculate {
    public static void main(String[] args) {
        // Write a Stream Expression to...
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        // get the even numbers from the above list
        numbers.stream()
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);

        // get the squared value of the positive numbers from the above list
        numbers.stream()
                .filter(x -> x > 0)
                .map(x -> x * x)
                .forEach(System.out::println);

        // find which number squared value is more then 20 from the below list
        List<Integer> numbers2 = Arrays.asList(3, 9, 2, 8, 6, 5);
        numbers2.stream()
                .map(x -> x * x)
                .filter(x -> x > 20)
                .forEach(System.out::println);

        // get the average value of the odd numbers from the numbers list
        numbers.stream()
                .filter(x -> x % 2 == 1)
                .mapToDouble(Integer::doubleValue)
                .average()
                .ifPresent(System.out::println);

        // get the sum of the odd numbers in the following list:

        List<Integer> numbers3 = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
        int sum = numbers3.stream()
                .filter(x -> x % 2 == 1)
                .mapToInt(x -> x)
                .sum();
        System.out.println("Sum values: " + sum);

    }
}
