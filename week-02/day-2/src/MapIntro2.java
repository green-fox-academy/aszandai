import java.util.HashMap;
import java.util.Map;

public class MapIntro2 {
    public static void main(String[] args) {
        Map<String, String> example = new HashMap<>();
        example.put("978-1-60309-452-8", "A Letter to Jo");
        example.put("978-1-60309-459-7", "Lupus");
        example.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        example.put("978-1-60309-461-0", "The Lab");

        for (Map.Entry<String, String> exampleRead : example.entrySet()) {
            System.out.println(exampleRead.getValue() + " (ISBN: " + exampleRead.getKey() + ")");
        }
        System.out.println();

        example.remove("978-1-60309-444-3");
        example.remove("The Lab");

        example.put("978-1-60309-450-4", "They Called Us Enemy");
        example.put("978-1-60309-453-5", "Why Did We Trust Him?");

        System.out.println(example.get("478-0-61159-424-8"));
        System.out.println(example.get("978-1-60309-453-5"));
    }
}
