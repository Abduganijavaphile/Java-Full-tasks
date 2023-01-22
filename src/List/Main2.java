package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Abdugani");  //0
        list.add("Mobiler");   //1
        list.add("Academy");   //2
        list.add("Blabla");    //3

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}