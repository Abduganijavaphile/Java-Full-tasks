import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Arrays7 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         Random random = new Random();
         int n = scanner.nextInt();
         int[] a = new int[n];

         for (int i = 0; i < a.length; i++) {
             a[i] = random.nextInt(100);
         }
         System.out.println(Arrays.toString(a));
         int max = a[0];
         int min = a[0];
         for (int i = 0; i < a.length; i++) {
             if (max < a[i]) {
                 max = a[i];
             }
             if (min > a[i]) {
                 min = a[i];
             }
         }
         System.out.println(max);
         System.out.println(min);
     }
}
