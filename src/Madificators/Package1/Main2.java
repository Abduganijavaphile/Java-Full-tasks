package Madificators.Package1;

public class Main2 {
    public static void main(String[] args) {

        Adress a1 = new Adress("Uzb", "Kashkadaryo", "Shakhrisabz", "22");
        Person p1 = new Person("Abdugani", 23, 'M', a1);
        System.out.println(p1);
    }
}