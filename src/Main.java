import static java.lang.Math.PI;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name = "Maskvich";
        c1.color = "blue";
        c1.function = "Yolovchi tashish";
        c1.strength = "20 ot kuchi";
        System.out.println(c1.name);
        System.out.println(c1.color);
        System.out.println(c1.function);
        System.out.println(c1.strength);
        c1.run();
        System.out.println("=====");
        Car c2 = new Car();
        c2.name = "Limuzin";
        c2.color = "white";
        c2.function = "bla bla";
        c2.strength = "30 ot kuchi";
        System.out.println(c2.name);
        System.out.println(c2.color);
        System.out.println(c2.function);
        System.out.println(c2.strength);
        c2.run();
        System.out.println("=====");
        Car c3 = new Car();
        c3.name = "Isuzi";
        c3.color = "Yellow";
        c3.function = "Yuk tashish";
        c3.strength = "100 ot kuchi";
        System.out.println(c3.name);
        System.out.println(c3.color);
        System.out.println(c3.function);
        System.out.println(c3.strength);
        c3.run();
        System.out.println(PI);
    }
}
