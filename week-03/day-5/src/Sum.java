public class Sum {
    // Given a non-negative integer n, return the sum of it's digits recursively (without loops).
    //
    // Hint
    // Mod (%) by 10 yields the rightmost digit (e.g. 126 % 10 is 6)
    // Divide (/) by 10 removes the rightmost digit (e.g. 126 / 10 is 12).

    public static void main(String[] args) {
        System.out.println("N with mod (%): " + sumDigits(12345 % 10));
        System.out.println("N divided (/): " + sumDigits(12345 / 10));
        System.out.println("The sum of both: " + sumDigits(12345));
    }

    public static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10 + sumDigits(n / 10));
    }
}
