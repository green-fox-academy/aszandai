import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of lines you want:");
        int readNum = scanner.nextInt();

        for (int rows = 1; rows <= readNum; rows++) {
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
