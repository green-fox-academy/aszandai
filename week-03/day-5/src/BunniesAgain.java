public class BunniesAgain {
    // We have bunnies standing in a line,
    // numbered 1, 2, 3, 4, ...
    // The odd bunnies (1, 3, ...) have the normal 2 ears.
    // The even bunnies (2, 4, ..) we'll say have 3 ears,
    // because they each have a raised foot.
    // Recursively return the number of "ears" in
    // the bunny line 1, 2, ... n (without loops or multiplication).

    public static int getBunnyEarsAgain(int bunnies) {
        int ears2 = 2;
        int ears3 = 3;

        if (bunnies == 1) {
            return ears2;
        } else if (bunnies % 2 == 1) {
            return bunnies + ears2;
        } else if (bunnies % 2 == 0) {
            return bunnies + ears3;
        }
        return getBunnyEarsAgain(bunnies);
    }

    public static void main(String[] args) {
        System.out.println(getBunnyEarsAgain(9));
    }
}
