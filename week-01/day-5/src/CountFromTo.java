import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        // Create a program that asks for two numbers
        // If the second number is not bigger than the first one it should print:
        // "The second number should be bigger"
        //
        // If it is bigger it should count from the first number to the second by one
        //
        // example:
        //
        // first number: 3, second number: 6, should print:
        //
        // 3
        // 4
        // 5

        System.out.println("Enter two numbers:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a < b) {
            for (int i = 0; a < b; a++) {
                System.out.println(a);
            }
        } else System.out.println("The second number should be bigger");
    }
}
