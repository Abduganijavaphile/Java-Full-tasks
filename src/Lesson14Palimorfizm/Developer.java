package Lesson14Palimorfizm;

public class Developer extends Person{
    double salary;

    @Override
    public String toString() {
        return "Developer{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
