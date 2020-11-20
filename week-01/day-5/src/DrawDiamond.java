import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of lines you want:");
        int readNum = scanner.nextInt();

        for (int rows = 1; rows <= readNum / 2 + 1; rows++) {
            for (int columns = 1; columns <= readNum - rows; columns++) {
                System.out.print(" ");
            }
            for (int columns = 1; columns <= rows * 2 - 1; columns++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int rows = readNum / 2; rows >= 0; rows--) {
            for (int columns = 1; columns <= readNum - rows; columns++) {
                System.out.print(" ");
            }
            for (int columns = 1; columns <= rows * 2 - 1; columns++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
