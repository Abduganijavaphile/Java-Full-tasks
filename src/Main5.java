import java.util.Scanner;
public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        //boolean c = isToqJuft(b);
        System.out.println(isToqJuft(b));
    }
    static boolean isToqJuft(int a){
        if (a%2==0){
            return false;
        }else {
            return true;
        }
    }
}
