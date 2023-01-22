import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array18 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(100);

        }
        System.out.println(Arrays.toString(a));
        int b = 0;
        for (int i = 0; i < n-1; i++) {
            if(a[i-1]>a[i]){
                b = a[i];
                break;
            }
        }
        System.out.println(b);
    }
}
