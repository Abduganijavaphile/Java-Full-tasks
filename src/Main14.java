import java.util.Scanner;
public class Main14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // recursive
        show();
    }
    static void show(){
        System.out.println("Hello");
        show();
    }
}
