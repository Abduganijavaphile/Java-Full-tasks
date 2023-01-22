package Set.Object;

import java.util.HashSet;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Abdugani");
        set.add("Javaphile");
        set.add("Java");
        set.add("Jeck");
        set.add("Coffee");

        System.out.println(set);
        set.remove("Jeck");
        set.add("Jony");
        System.out.println(set);
    }
}
