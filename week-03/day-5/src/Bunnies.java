public class Bunnies {
    // We have a number of bunnies and each bunny has two big floppy ears.
    // We want to compute the total number of ears
    // across all the bunnies recursively (without loops or multiplication).


    public static int getBunnyEars(int bunnies) {

        if (bunnies >= 0) {
            return bunnies * 2;
        }
        return getBunnyEars(bunnies);
    }

    public static void main(String[] args) {
        System.out.println(getBunnyEars(7));
    }
}
