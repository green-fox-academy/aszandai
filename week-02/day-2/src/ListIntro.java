import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntro {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        System.out.println(names);

        names.add("William");
        System.out.println(names);

        names.add("John");
        names.add("Amanda");

        System.out.println(names);
        System.out.println(names.get(2));

//        for (int i = 0; i < names.size(); i++) {
//            System.out.println(names.get(i));
//        }
//        Same loop as below

        for (String name : names) {
            System.out.println(name);
        }


        for (int i = 0; i < names.size(); i++) {
            System.out.println(Arrays.asList(i+1 + ". " + names.get(i)));
        }

        names.remove(1);

        for (int i = names.size() - 1; i >= 0 ; i--) {
            System.out.println(names.get(i));
        }

        names.removeAll(names);
        System.out.println(names);
    }
}
