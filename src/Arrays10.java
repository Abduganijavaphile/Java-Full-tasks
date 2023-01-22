import java.io.OutputStream;
import java.util.Arrays;

public class Arrays10 {
    public static void main(String[] args) {
        int[] a = {35, 23, 47, 98, 35};
        System.out.println(Arrays.stream(a).max().getAsInt());
        System.out.println(Arrays.stream(a).min().getAsInt());
        System.out.println(Arrays.stream(a).sum());
        System.out.println(Arrays.stream(a).average().getAsDouble());
        System.out.println("======");
        Arrays.stream(a).distinct().forEach(System.out::println);
        System.out.println("====");
        Arrays.stream(a).filter(item -> item % 2 == 1).forEach(System.out::println);
        System.out.println("======");
        Arrays.stream(a).map(item -> item * 2).forEach(System.out::println);
    }
}
