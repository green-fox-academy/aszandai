import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Write a program that stores a number, and the user has to figure it out.
        // The user can input guesses, after each guess the program would tell one
        // of the following:
        //
        // The stored number is higher
        // The stored number is lower
        // You found the number: 8

        Scanner scanner = new Scanner(System.in);
        Random randomNumber = new Random();
        System.out.println("Please enter your guess:");

        int storedNumber = randomNumber.nextInt(100);
        int guess = scanner.nextInt();

        while (guess != storedNumber) {
            if (guess > storedNumber) {
                System.out.println("The stored number is lower");
            } else if (guess < storedNumber) {
                System.out.println("The stored number is higher");
            }
            guess = scanner.nextInt();
        }
        System.out.println("You found the number: " + guess);
    }
}
