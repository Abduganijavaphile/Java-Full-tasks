package Map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main6 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Toshkent");
        list.add("Samarqand");
        list.add("Karshi");
        list.add("Shakhrisabz");


        List<String> list1 = list.stream().filter(item -> item.length() > 6).collect(Collectors.toList());
        System.out.println(list1);
    }
}
