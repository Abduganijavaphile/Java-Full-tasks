package Task;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        User[] users = new User[100];
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("1 -> Ro'yxatdan o'tish ; 2 -> Tizimga kirish");
            int n = scanner.nextInt();
            switch (n){
                case 1 -> {
                    System.out.println("First name: ");
                    String firstName = scanner.next();
                    System.out.println("Last name: ");
                    String lastName = scanner.next();
                    System.out.println("Email: ");
                    String email = scanner.next();
                    System.out.println("Phone number: ");
                    String phoneNumber = scanner.next();
                    System.out.println("Password: ");
                    String password = scanner.next();
                    User u1 = new User(firstName, lastName, email, phoneNumber, password);
                    count ++;
                    System.out.println("Successfully registred");
                }
                case 2 -> {
                    System.out.println("Phone number: ");
                    String phoneNumber = scanner.next();
                    System.out.println("Password: ");
                    String password = scanner.next();
                    int index = -1;
                    for (int i = 0; i < count; i++) {
                        if (users[i].phoneNumber.equals(phoneNumber) && users[i].password.equals(password)){
                            index = i;
                            break;
                        }
                    }
                    if(index == -1){
                        System.out.println("Phone number or password incorrect");
                    } else {
                        System.out.println(users[index].firstName + " " + users[index].lastName + " Welcome!!!");
                    }
                }
            }
        }
    }
}
