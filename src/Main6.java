import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b =sc.nextInt();
        System.out.println(reversedNumber(b));

    }
    static int reversedNumber(int a){
        int sum = 0;
        while (a != 0){
            int b = a % 10;
            sum = sum * 10 + b;
            a /= 10;
        }
        return sum;
    }
}
