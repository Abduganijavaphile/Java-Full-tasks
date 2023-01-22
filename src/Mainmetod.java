import java.util.Scanner;

public class Mainmetod {
    public static void main(String[] args) {
        //show();
        Scanner sc = new Scanner(System.in);
        String  n =sc.next();
        display(n);
    }

    // void -> qiymat qaytarmaydi
    // void bo'lmagan -> int ,double,....qiymat qaytaradi

    static void show(){
        System.out.println("first project");
    }
    static void display(String name) {
        System.out.println("My first project " + name);
    }
}
