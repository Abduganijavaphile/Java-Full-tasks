import java.util.Random;
import java.util.Scanner;

public class Array17 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt();

        }
        System.out.println(a);
    }
}
