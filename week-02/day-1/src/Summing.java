public class Summing {
    // Create the usual class wrapper and main method on your own.
    // Write a function called `sum` that returns the sum of numbers from zero to the given parameter

    public static void sum(int numbers) {
        int sum = 0;
        for (int i = 0; i <= numbers; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        sum(4);
    }
}
