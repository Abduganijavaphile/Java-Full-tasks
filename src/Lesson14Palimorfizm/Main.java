package Lesson14Palimorfizm;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Object a = ':';
        if (a instanceof String) {
            String b = (String) a;
            System.out.println(b);
        }
        if (a instanceof Double) {
            double b = (double) a;
            System.out.println(b);
        }
        if (a instanceof Integer) {
            int b = (int) a;
            System.out.println(b);
        }
        if (a instanceof List) {
            int b = (int) a;
            System.out.println(b);
        }
        if (a instanceof Character) ;{
            System.out.println(a);
        }
    }

}
