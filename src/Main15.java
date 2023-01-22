import java.util.Scanner;
public class Main15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //System.out.println(fact1(a));
        System.out.println(fact2(a));
    }
    static int fact2(int n){
        if (n == 1){
            return n;
        }else {
            return n * fact2(n-1);
        }
    }
    static int fact1(int n){
        int p = 1;
        for (int i = 1; i <= n; i++) {
            p *= 1;
        }
        return p;
    }
}
