package Lesson13Vorislik;

public class Developer extends Person{   //bola class -> sub class
    double salary;

    public Developer(String name, int age, char gender, double salary) {
        super(name, age, gender);
        this.salary = salary;
    }

    public Developer(double salary){
        this.salary = salary;
    }

    public Developer() {
    }

    @Override
    public void show() {
        System.out.println(getName() + " " + getAge() + " " + getGender());
    }
}
