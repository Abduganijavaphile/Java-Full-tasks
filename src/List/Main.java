package List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Abdugani");  //0
        list.add("Mobiler");   //1
        list.add("Academy");   //2
        list.add("Blabla");    //3

        System.out.println(list);
        list.add(2,"Goodboy");  //element qo'shish
        System.out.println(list);
        System.out.println(list.get(2));     //element ajratib olish
        list.set(1,"Java");                  //element o'zgartirish
        System.out.println(list);
    }
}
