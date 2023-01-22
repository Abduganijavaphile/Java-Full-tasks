package Set.Object;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        Set<String> set = new HashSet<>();
        set.add("Abdugani");
        set.add("Javaphile");
        set.add("Java");
        set.add("Jeck");
        set.add("Coffee");

        set.remove("Java");
        System.out.println(set);
        for (String s : set) {
            System.out.println(s);
        }
    }
}
