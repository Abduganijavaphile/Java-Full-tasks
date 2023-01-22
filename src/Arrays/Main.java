package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a1 = sc.nextInt();
        int d = sc.nextInt();
        int[] b = new int[n];
        b[0] = a1;
        for (int i = 1; i < n; i++) {
            int an = a1 + d;
            b[i] = an;
            a1 = an;
        }
        System.out.println(Arrays.toString(b));

    }
}
