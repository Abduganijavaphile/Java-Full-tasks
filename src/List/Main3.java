package List;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Abdugani");  //0
        list.add("Mobiler");   //1
        list.add("Academy");   //2
        list.add("Blabla");    //3

        System.out.println(list);
        list.remove(2);
        System.out.println(list);

    }
}
