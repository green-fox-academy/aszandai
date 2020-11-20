import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %%  %
        // % % %
        // %  %%
        // %%%%%
        //
        // The square should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of lines you want:");
        int readNum = scanner.nextInt();

        for (int rows = 1; rows <= readNum; rows++) {
            for (int columns = 1; columns <= readNum; columns++) {
                if (rows == 1 || rows == readNum) {
                    System.out.print("%");
                    continue;
                }
                if (columns == 1 || columns == readNum) {
                    System.out.print("%");
                    continue;
                }
                if (rows == columns) {
                    System.out.print("%");
                    continue;
                } else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
