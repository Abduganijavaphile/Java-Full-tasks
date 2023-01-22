package Lesson13Vorislik;

public class Main2 {
    public static void main(String[] args) {
        Circle c1 = new Circle(2,"black");
        System.out.println(c1);

        Cylender cy = new Cylender(2.5,"yellow",3);
        System.out.println(cy);

        Coder c2 = new Coder();
        c2.show();

    }
}
