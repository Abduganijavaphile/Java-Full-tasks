package Lesson13Vorislik;

public class Car extends Transport{
    private int price;

    public Car(String name, String color, double size, int price) {
        super(name, color, size);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
