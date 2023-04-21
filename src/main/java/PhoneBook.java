import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    static Map<String, String> phoneBook = new TreeMap<>();

    public static int add(String name, String number) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, number);
        }
        return phoneBook.size();
    }

    public static String findByNumber(String number) {
        if (phoneBook.containsValue(number)) {
            for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                if (phoneBook.get(entry.getKey()).equals(number)) {
                    return entry.getKey();
                }
            }
        }
        return "No name";
    }
}
