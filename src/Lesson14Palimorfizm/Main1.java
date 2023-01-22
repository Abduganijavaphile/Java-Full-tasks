package Lesson14Palimorfizm;

public class Main1 {
    public static void main(String[] args) {
        String a = "Mobiler";
        Object b = a;

        Developer d1 = new Developer();
        d1.name = "Abdugani";
        d1.salary = 1000;
        System.out.println(d1);

        Person p1 = d1;
        System.out.println(p1.name);
        System.out.println(d1);
    }
}
