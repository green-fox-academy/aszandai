public class Factorial {
    //  Create the usual class wrapper
    //  and main method on your own.
    // - Create a function called `factorio`
    //   that returns it's input's factorial

    public static void factorio(int input) {
        //Example: 5! = 5*4*3*2*1 = 120

        int factNum = 1;
        for (int i = 1; i <= input; i++) {
            factNum = factNum * i;
        }
        System.out.println(input + "!" + " factorial equals = " + factNum);
    }

    public static void main(String[] args) {
        factorio(4);
    }
}
