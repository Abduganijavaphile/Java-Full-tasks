package Lesson13Vorislik;

public class Cylender extends Circle{
    private double height;

    public Cylender(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public double getVolume(){
        double V = getRadius()*getRadius()*Math.PI*getHeight();
        return V;
    }
    public double getArea(){
        return getArea();
    }

    @Override
    public String toString() {
        return "Cylender{" +
                "height=" + height +
                '}';
    }
}
