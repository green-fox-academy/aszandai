import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {
    public static void main(String[] args) {
        Map<String, String> contacts = new HashMap<>();

        contacts.put("William A. Lathan", "405-709-1865");
        contacts.put("John K. Miller", "402-247-8568");
        contacts.put("Hortensia E. Foster", "606-481-6467");
        contacts.put("Amanda D. Newland", "319-243-5613");
        contacts.put("Brooke P. Askew", "307-687-2982");

//        Listing all the names and their phone numbers
//        for(Map.Entry<String, String> names : contacts.entrySet()) {
//            System.out.println("Name: " + names.getKey() + ", phone number: " + names.getValue());
//        }

        System.out.println(contacts.get("John K. Miller"));
        for (Map.Entry<String, String> wantedName : contacts.entrySet()) {
            if (wantedName.getValue() == "307-687-2982") {
                System.out.println(wantedName.getKey());
            }
        }
        System.out.println(contacts.get("Chris E. Myers"));

    }
}
