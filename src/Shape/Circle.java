package Shape;

public class Circle extends Shape{

    public Circle(double a) {
        super(a);
    }

    @Override
    public void perimetr() {
        System.out.println(2*Math.PI*getA());
    }

    @Override
    public void area() {
        System.out.println(Math.PI*getA()*getA());
    }
}
