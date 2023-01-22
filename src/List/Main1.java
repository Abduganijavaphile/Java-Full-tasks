package List;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Abdugani");  //0
        list.add("Mobiler");   //1
        list.add("Academy");   //2
        list.add("Blabla");    //3

        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
        System.out.println("========");

        for (String item : list) {
            System.out.println(item);
        }
        System.out.println("=======");
        list.forEach(System.out::println);
    }
}