import java.util.Arrays;
import java.util.List;

public class ShoppingList {
    public static void main(String[] args) {
        List<String> groceries = Arrays.asList("Eggs", "Milk", "Fish", "Apples", "Bread", "Chicken");

        System.out.println("Does the list contains milk? The answer is: " + groceries.contains("Milk"));
        System.out.println("Does the list contains bananas? The answer is: " + groceries.contains("Bananas"));
    }
}
