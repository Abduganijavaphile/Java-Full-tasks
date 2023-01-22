package Set.Object;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main10 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        List<String> list1 = new ArrayList<>(list);

        Set<String> set = new TreeSet<>();
        set.addAll(list);
    }
}
