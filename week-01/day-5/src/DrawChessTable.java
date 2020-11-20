public class DrawChessTable {
    public static void main(String[] args) {
        // Crate a program that draws a chess table like this
        //
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        //

        for (int rows = 0; rows < 8; rows++) {
            for (int columns = 0; columns < 4; columns++) {
                if ((rows % 2) == 0) {
                    System.out.print("% ");
                } else System.out.print(" %");
            }
            System.out.println();
        }
    }
}
