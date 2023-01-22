package Inner.Enam;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean a = true;
        while (a){
            System.out.println("1-> Choose level; 2-> The end");
            int n = scanner.nextInt();
            switch (n){
                case 1->{
                    Level[] levels=Level.values();
                    for (int i = 0; i < levels.length; i++) {
                        System.out.println((i+1)+" -> "+levels[i]);
                    }
                    int levelType = scanner.nextInt()-1;
                    Level level = levels[levelType];
                    switch (level){
                        case Low -> {
                            setMath(10);
                        }
                        case Medium -> {
                            setMath(100);
                        }
                        case Heigh -> {
                            setMath(1000);
                        }
                    }
                }
                case 2->{
                    a = false;
                }
            }
        }
    }

    static void setMath(int max){
        Random random = new Random();
        int a = random.nextInt(max);
        int b = random.nextInt(max);
        int c = random.nextInt(4);
        int result=0;
        switch (c) {
            case 0 -> {
                result = a + b;
                System.out.print(a + "+" + b + "=");
            }
            case 1 -> {
                result = a - b;
                System.out.print(a + "-" + b + "=");
            }
            case 2 -> {
                result = a * b;
                System.out.print(a + "*" + b + "=");
            }
            case 3 -> {
                result = a / b;
                System.out.print(a + "/" + b + "=");
            }
        }
        Scanner scanner = new Scanner(System.in);
        int myResult = scanner.nextInt();
        if(myResult == result){
            System.out.println("Great");
        }else {
            System.out.println("Try again your IQ level very poor");
        }
    }
}
