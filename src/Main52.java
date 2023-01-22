import java.util.Arrays;

public class Main52 {
    public static void main(String[] args) {
       //[]
       int[] a = {45, 90, 23, 89};
       int b[] = {34, 43, 54, 97};
        System.out.println(a.length);
        // 1. Element
        // 2. Index
        System.out.println(Arrays.toString(a));
        a[0] = 40;
        System.out.println(Arrays.toString(a));
    }
}
