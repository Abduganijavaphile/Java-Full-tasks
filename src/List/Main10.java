package List;

import java.util.ArrayList;
import java.util.List;

public class Main10 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Abdugani");
        list1.add("Jeck");
        list1.add("Wenthday");
        list1.add("Blabla");

        Object[] objects = list1.toArray();
        for (Object object : objects) {
            System.out.println(object);
        }


    }
}
