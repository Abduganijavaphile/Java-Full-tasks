package Shape;

public class Square extends Ractangle{
    public Square(double a) {
        super(a);
    }

    @Override
    public void perimetr() {
        System.out.println(4*getA());
    }

    @Override
    public void area() {
        System.out.println(getA()*getA());
    }
}
