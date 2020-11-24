import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntro2 {
    public static void main(String[] args) {
//        List<String> listA = Arrays.asList("Apple", "Avocado", "Blueberries", "Durian", "Lychee");
        List<String> listA = new ArrayList<>();
        listA.add("Apple");
        listA.add("Avocado");
        listA.add("Blueberries");
        listA.add("Durian");
        listA.add("Lychee");

        List<String> listB = new ArrayList<>();

        listB.addAll(listA);

        System.out.println(listA);

        listB.remove("Durian");

        listA.add(4, "Kiwifruit");

        System.out.println(listA);

        int sizeA = listA.size();
        int sizeB = listB.size();
//        System.out.println("Size of list A: " + sizeA);
//        System.out.println("Size of list B: " + sizeB);
        System.out.println(sizeA == sizeB);
//        System.out.println(sizeA > sizeB);
//        System.out.println(sizeA < sizeB);

        System.out.println(listA.indexOf("Avocado"));
        System.out.println(listB.indexOf("Durian"));

        listB.addAll(Arrays.asList("PassionFruit", "Pomelo"));
//        System.out.println(listB);

        System.out.println(listA.get(2));
    }
}
