import java.util.Scanner;
public class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(isPrime(a));
    }

    static boolean isPrime(int n) {
        int k = 0;
        for (int i = 1; i <= n; i++) {
            if (n %  i == 0) {
                k++;
            }
        }
        return k == 2;
    }
}

