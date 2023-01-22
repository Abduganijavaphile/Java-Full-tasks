package Shape;

public class Ractangle extends Shape{

    public Ractangle(double a) {
        super(a);
    }

    public Ractangle(double a, double b) {
        super(a, b);
    }

    @Override
    public void perimetr() {
        System.out.println(2*getA()+getB());
    }

    @Override
    public void area() {
        System.out.println(getA()*getB());
    }
}
