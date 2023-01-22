package List;

import jdk.internal.icu.text.UnicodeSet;

import java.util.ArrayList;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Abdugani");
        list1.add("Mobiler");
        list1.add("Academy");
        list1.add("Blabla");

        List<String> list2 = new ArrayList<>();
        list2.add("Jeck");
        list2.add("Wenthday");
        list2.add("Football");

        list1.addAll(2,list2);
        System.out.println(list1);
    }
}
