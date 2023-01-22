package List;

import java.util.ArrayList;
import java.util.List;

public class Main8 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Abdugani");
        list1.add("Jeck");
        list1.add("Wenthday");
        list1.add("Blabla");

        System.out.println(list1.contains("Wenthday"));
    }
}
