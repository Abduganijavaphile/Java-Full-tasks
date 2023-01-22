import java.util.Scanner;
public class Main13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(frac1(A, B));

    }
    static String frac1(int a, int b){ //18, 12
       int ekub = Main12.ekub(a, b);
       return a / ekub + "/" + b / ekub;

    }
}
