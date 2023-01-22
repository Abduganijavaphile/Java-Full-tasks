package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("hello", "salom");
        map.put("book", "kitob");
        map.put("pen", "ruchka");
        map.put("pencil", "qalam");

        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }

    }
}
