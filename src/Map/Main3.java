package Map;

import java.util.HashMap;
import java.util.Map;

public class Main3 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("hello", "salom");
        map.put("book", "kitob");
        map.put("pen", "ruchka");
        map.put("pencil", "qalam");

        map.remove("pen");
        System.out.println(map);
    }
}
