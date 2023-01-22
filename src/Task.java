public class Task {
    public static void main(String[] args) {
        System.out.println("Fact(5): " + fact(5));
    }

    static int fact(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    //n = 5: 5*4*3*2*1
    //n = 4: 4*3*2*1
    //n = 3: 3*2*1
    //n = 2: 2*1
    //n = 1: 1

}
