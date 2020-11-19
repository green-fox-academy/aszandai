import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        Scanner scanner = new Scanner(System.in);
        int chickens = scanner.nextInt();
        int pigs = scanner.nextInt();

        int chickenLegs = 2;
        int pigLegs = 4;

        int sum = chickens * chickenLegs + pigs * pigLegs;

        System.out.println("All the animal legs: " + sum);
    }
}