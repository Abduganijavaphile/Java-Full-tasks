package Madificators.Package1;

public class Teacher {
    String name;           // default
    public double salary;  // public
    private String degree; // private

    public Teacher(String name, double salary, String degree) {
        this.name = name;
        this.salary = salary;
        this.degree = degree;
    }

    public Teacher() {
        
    }

    public void getDegree(String oliy) {
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", degree='" + degree + '\'' +
                '}';
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    /*public int getAge(){
        if(age>20){
            return age;
        }else {
            return 0;
        }
    }
    public void setAge(int age){
        if(age<20){
            this.age = 0;
        }else {
            this.age = age;
        }
    }

    public String getDegree() {
        return this.degree;
    }
    public void setDegree(String degree) {
        this.degree = degree;
    }*/

}
