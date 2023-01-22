import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int b = Main3.sumNumbers2(a);
        System.out.println(b + a);

    }

}
