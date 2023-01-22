package Madificators.Package1;

public class Person {
    private String name;
    private int age;
    private char gender;
    private Adress adress;     // agregation = 1 ta class boshqa 1 classning faildi bolib kelishi.

    public Person(String name, int age, char gender, Adress adress) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", adress=" + adress +
                '}';
    }
}
