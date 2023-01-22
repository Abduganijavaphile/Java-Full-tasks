package Inner;

import Inner.Car.Engine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car();
        System.out.println(c1.Start);

        Car.Engine e1 = c1.new Engine();
        System.out.println(e1.run);
    }
}
