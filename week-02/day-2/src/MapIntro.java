import java.util.HashMap;
import java.util.Map;

public class MapIntro {
    public static void main(String[] args) {
        Map<Integer, Character> example= new HashMap<>();

        System.out.println(example);

        example.put(97,'a');
        example.put(98,'b');
        example.put(99,'c');
        example.put(65,'A');
        example.put(66,'B');
        example.put(67,'C');

        System.out.println(example.keySet());
        System.out.println(example.values());

        example.put(68, 'D');

        System.out.println(example.size());

        System.out.println(example.get(99));
        example.remove(97);

        System.out.println(example.get(100));

        example.clear();
//        System.out.println(example);
    }
}
