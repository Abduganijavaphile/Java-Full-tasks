import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int c = sc.nextInt();
        sum(b, c);

    }
    static void sum(int a, int b){
        System.out.println(a + b);
    }

    static void musbatManfiy(int a){
        if (a>0){
            System.out.println("Musbat son");
        }else if (a<0){
            System.out.println("Manfiy son");
        }else {
            System.out.println("Nolga teng");
        }
    }
}
