import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Arrays8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(a));

        System.out.println("======");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("========");
        for (int item : a){
            System.out.println(item);
        }
    }
}
