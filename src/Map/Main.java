package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("hello", "salom");
        map.put("book", "kitob");
        map.put("pen", "ruchka");
        map.put("pencil", "qalam");
        System.out.println(map);

        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

    }
}
