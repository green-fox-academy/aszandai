import java.util.ArrayList;
import java.util.List;

public class Sum {
    public static void sumOfElements(List<Integer> list) {
        Integer sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        sumOfElements(list);
        System.out.println(list);
    }
}
