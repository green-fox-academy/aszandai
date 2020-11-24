import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonalFinance {
    public static void main(String[] args) {
        List<Integer> spendings = Arrays.asList(500, 1000, 1250, 175, 800, 120);
        System.out.println(spendings);

        getSum(spendings);
        System.out.println("The greatest expense is: " + Collections.max(spendings));
        System.out.println("The cheapest expense is: " + Collections.min(spendings));

        int average = getSum(spendings) / spendings.size();
        System.out.println(average);
    }

    private static int getSum(List<Integer> spendings) {
        int sum = 0;
        for (int i : spendings) {
            sum = sum + i;
        }
        System.out.println(sum);
        return sum;
    }
}
