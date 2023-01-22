import java.util.Scanner;
public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(max(a, max(b, max(c, d))));
        System.out.println(min(a, min(b, min(c, d))));
    }
    static int max(int x, int y){
        return x >= y ? x : y;
    }
    static int min(int x, int y){
        return x < y ? x : y;
    }
}
