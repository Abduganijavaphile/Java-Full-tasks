package Lesson13Vorislik;

public class Main1 {
    public static void main(String[] args) {
        Person p1 = new Person("Abdugani",22,'M');
        p1.show();

        Developer d1 = new Developer("Jack",20,'M',1000);
        d1.salary = 1000;
        d1.show();
    }
}
