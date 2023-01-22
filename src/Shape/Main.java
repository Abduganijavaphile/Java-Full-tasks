package Shape;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        c1.perimetr();
        c1.area();

        Ractangle r1 = new Ractangle(4,5);
        r1.perimetr();
        r1.area();

        Square s1 = new Square(6);
        s1.perimetr();
        s1.area();

        Triangle t1 = new Triangle(3,4,5);
        t1.perimetr();
        t1.area();
    }
}
