import java.util.Scanner;

public class DiagonalMatrix {
    public static void main(String[] args) {
        // - Create (dynamically*) a two dimensional array
        //   with the following matrix**. Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        // - Print this two dimensional array to the output
        // * length should depend on a variable
        // ** Relax, a matrix is just like an array

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of lines you want:");
        int readNum = scanner.nextInt();
        int[][] matrix = new int[readNum][readNum];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i] == matrix[j]) {
                    System.out.print(1);
                } else System.out.print(0);
            }
            System.out.println();
        }
    }
}
