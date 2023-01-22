package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("hello", "salom");
        map.put("book", "kitob");
        map.put("pen", "ruchka");
        map.put("pencil", "qalam");

        String value = map.get("book");
        System.out.println(value);

        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.println(s + " -> " +map.get(s));
        }
    }
}
