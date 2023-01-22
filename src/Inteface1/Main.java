package Inteface1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactService service = new ContactServiceImpl();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1-> Add; 2-> List");
            int n = scanner.nextInt();
            switch (n){
                case 1->{
                    service.addContact();
                }
                case 2->{
                    service.listContact();
                }
            }
        }
    }
}
