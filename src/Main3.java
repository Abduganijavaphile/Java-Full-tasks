import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sumNumber(a);
    }
    static void sumNumber(int number) {   //1234
        int sum = 0;
        while (number != 0){
            int a = number % 10;
            sum += a;
            number /= 10;
        }
        System.out.println(sum);
    }
    static int sumNumbers2(int number) {   //1234
        int sum = 0;
        while (number != 0){
            int a = number % 10;
            sum += a;
            number /= 10;
        }
        return sum;
    }
}
