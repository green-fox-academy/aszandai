public class Reverse {
    public static void main(String... args) {
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.

        System.out.println(reverse(toBeReversed));
    }

    private static char reverse(String toBeReversed) {
        String reverse = "";

        for (int i = toBeReversed.length()-1; i >= 0; i--) {
            reverse = reverse + toBeReversed.charAt(i);
        }
        System.out.println(reverse);
        return 0;
    }
//    private static void reverse(String toBeReversed) {
//        private static String reverse (String toBeReversed){
//            char[] reverse = toBeReversed.toCharArray();
//            for (int i = toBeReversed.length() - 1; i >= 0; i--) {
//                System.out.print(reverse[i]);
//            }
//            return "\nThe reverse was successful.";
//        }
//    }
}

