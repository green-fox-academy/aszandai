public class Power {
    public static void main(String[] args) {
        // Given base and n that are both 1 or more, compute recursively (no loops) the
        // value of base to the n power, so powerN(3, 2) is 9 (3 squared).

//        double n = 3;
//        double base = 2;
//        double result = 1;
//        while (base != 0) {
//            result *= n;
//            base--;
//        }
//        System.out.println(result);

        System.out.println(powerN(3, 2));

    }

    public static double powerN(double n, double base) {
        if (base == 1) {
            return base;
        }
        return powerN(n*n,base);
    }
}
