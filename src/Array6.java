import java.util.Arrays;
import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int[] a = new int[n];
        a[0] = A;
        a[1] = B;
        int sum = a[0]+a[1];
        for (int i = 2; i < n; i++) {
            a[i] = sum;
            sum+=a[i];
        }
        System.out.println(Arrays.toString(a));
    }
}
