import java.util.Scanner;
public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = 0;
        for (int i = 0; i < 5; i++) {
            int a = sc.nextInt();
            if(isPover5(a)){
                k++;
            }
        }
        System.out.println(k);

    }
    static boolean isPover5(int k){
        int i = 1 ;
        boolean isFive = false;
        while (i < k){
            i *= 5;
            if (i == k){
                isFive = true;
            }
        }
        return isFive;
    }
}
