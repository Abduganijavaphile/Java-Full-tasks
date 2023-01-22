package Madificators.Package1;

public class Student {
    String name;
    public String profession;
    private double studentFee;

    public Student() {
        this.name = name;
        this.profession = profession;
        this.studentFee = studentFee;
    }

    public double getStudentFee() {
        return studentFee;
    }

    public void setStudentFee(double studentFee) {
        this.studentFee = studentFee;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", profession='" + profession + '\'' +
                ", studentFee=" + studentFee +
                '}';
    }
}
