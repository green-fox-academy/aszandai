public class NumberAdder {
    public static void main(String[] args) {
        // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
        nPlusOne(0);
    }

    public static void nPlusOne(int n) {
        if (n >= 0) {
            nPlusOne(n + 1);
        }
        System.out.println(n);
    }
}
