import java.util.Arrays;
import java.util.Scanner;

public class Arrays11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        int k = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        a[0][1]=22;
        System.out.println(Arrays.deepToString(a));
    }
}
