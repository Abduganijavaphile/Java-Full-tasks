import java.util.Scanner;
public class Funksiya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        prevDate(a, b, c);

    }
    static  void prevDate(int day, int month, int year){
        boolean isHave = true;
        switch (month){
            case 1 -> {
                if (day == 1){
                    day = 31;
                    year -- ;
                    month = 12;
                } else if (day <= 31) {
                    day -- ;
                } else {
                    isHave = true;
                }
            }
            case 2-> {
                if(day==1){
                    day=31;
                    month--;
                } else if (day<=28){
                    day--;
                } else {
                    isHave = true;
                }
            }
            //  3..4..5..6....
            case 3, 5, 7, 8, 10, 12-> {
                if(day==1){
                    day=30;
                    month--;
                } else if(day<=31){
                    day--;
                } else{
                    isHave = true;
                }
            }
            case 4, 6, 9, 11-> {
                if(day==1){
                    day=31;
                    month--;
                } else if(day<=30){
                    day--;
                } else{
                    isHave = true;
                }
            }
        }
        //if (isHave){
            // System.out.println("Siz noto'g'ri oy kiritdingiz");
        //} else {
            System.out.println(day + "." + month + "." + year);
        }
    }

