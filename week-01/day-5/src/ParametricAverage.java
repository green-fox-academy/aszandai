import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        // Write a program that asks for a number.
        // It would ask this many times to enter an integer,
        // if all the integers are entered, it should print the sum and average of these
        // integers like:
        //
        // Sum: 22, Average: 4.4

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        double average = 0;

        System.out.println("Please enter the number of repeats:");
        int endNumber = scanner.nextInt();

        for (int i = 0; i < endNumber; i++) {
            System.out.println("Enter a number:");
            int addNumber = scanner.nextInt();
            sum = sum + addNumber;
        }
        average = sum / endNumber;
        System.out.println("Sum: " + sum + ", Average: " + average);
    }
}

