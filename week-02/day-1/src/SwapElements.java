import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SwapElements {
    public static void main(String[] args) {
        // - Create an array variable named `orders`
        //   with the following content: `["first", "second", "third"]`
        // - Swap the first and the third element of `orders`

        String[] orders = {"first", "second", "third"};

//        String temp = orders[0];
//        orders[0] = orders[2];
//        orders[2] = temp;
//        System.out.println(Arrays.toString(orders));

        Collections.swap(Arrays.asList(orders), 0, 2);
//        Neten talalt megoldas
//         - pro: mukodik a swap;
//         - con: lista, amit meg nem "tanultunk".

        System.out.println(Arrays.toString(orders));
    }
}
