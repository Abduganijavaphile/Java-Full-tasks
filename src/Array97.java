import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array97 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < n; i++) {
            boolean c = true;
            for (int j = i+1; j < n; j++) {
                if (a[i] == a[j]) {
                    c = false;
                    break;
                }
            }
            if(c){
                System.out.println(a[i]);
            }
        }
    }
}
