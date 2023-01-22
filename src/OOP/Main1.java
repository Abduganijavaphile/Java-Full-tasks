package OOP;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Trangle t1 = new Trangle();
        t1.a = scanner.nextDouble();
        t1.b = scanner.nextDouble();
        t1.c = scanner.nextDouble();
        t1.perimetr();
        t1.area();
    }
}
