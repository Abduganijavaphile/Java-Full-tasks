import java.util.Scanner;

public class Array8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = 0;
        for (int i = 0; i < n; i++) {
            if(a[i]%2==1){
                System.out.println(a[i]);
                k++;
            }

        }
        System.out.println(k);

    }
}
