package List;

import java.util.ArrayList;
import java.util.List;

public class Main6 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Abdugani");
        list1.add("Jeck");
        list1.add("Wenthday");
        list1.add("Blabla");

        List<String> list2 = new ArrayList<>();
        list2.add("Jeck");
        list2.add("Wenthday");
        list2.add("Football");

        list1.removeAll(list2);
        System.out.println(list1);
        System.out.println(list2);
    }
}
