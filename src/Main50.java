import java.util.Scanner;

public class Main50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        timeToHMS(s);

    }
    static void timeToHMS(int S){
        int hour = S / 3600;
        int minute = S % 3600 / 60;
        int sekund = S % 60;
        System.out.println(getZeroNumber(hour) + ":" + getZeroNumber(minute) + ":" + getZeroNumber(sekund));
        System.out.println(String.format("%02d",hour) + ":" + String.format("%02d",minute) + ":" + String.format("%02d",sekund));
    }
    static String getZeroNumber(int a){
        if(a < 10){
            return "0" + a;
        }else {
            return String.valueOf(a);
        }
    }
}
