package Lesson13Vorislik;

public class Transport {
    public String name;
    public String color;
    private double size;

    public Transport(String name, String color, double size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
