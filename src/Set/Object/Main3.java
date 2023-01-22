package Set.Object;

import java.util.HashSet;
import java.util.Set;

public class Main3 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Abdugani");
        set.add("Javaphile");
        set.add("Java");
        set.add("Jeck");
        set.add("Coffee");

        System.out.println(set);
        for (String s : set) {
            System.out.println(s.hashCode());
        }
    }
}
