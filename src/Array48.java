import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Array48 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(a));
        int k, max = 0, c = 0;
        for (int i = 0; i < n; i++) {
            k = 1;
            for (int j = i+1; j < n; j++) {
                if(a[i]==a[j]) {
                    k++;
                }
            }
            if(max<k){
                max=k;
                c = a[i];
            }
        }
        System.out.println(max);
        System.out.println(c);
    }
}
