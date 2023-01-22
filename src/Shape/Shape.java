package Shape;

public abstract class Shape {
    private double a;
    private double b;
    private double c;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public Shape() {

    }
    public Shape(double a, double b){
        this.a = a;
        this.b = b;
    }
    public Shape(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Shape(double a) {
        this.a = a;
    }

    public abstract void perimetr();

    public abstract void area();
}
