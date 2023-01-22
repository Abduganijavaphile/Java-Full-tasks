

import java.util.Scanner;
public class Main12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(ekub(A, B));

    }
    static int ekub(int a, int b){
        while (a != b){
            if (a > b){
                a -= b;
            }else {
                b -= a;
            }
        }
        return a;
    }
}
