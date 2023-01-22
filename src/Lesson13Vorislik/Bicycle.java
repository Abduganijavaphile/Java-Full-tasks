package Lesson13Vorislik;

public class Bicycle extends Transport{
    private int number;

    public Bicycle(String name, String color, double size, int number) {
        super(name, color, size);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "number=" + number +
                '}';
    }
}
