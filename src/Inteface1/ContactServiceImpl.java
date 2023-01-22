package Inteface1;

import java.util.Scanner;

public class ContactServiceImpl implements ContactService{
    private Contact[] contacts = new Contact[100];
    private int count = 0;
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void addContact() {
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("Number: ");
        String number = scanner.next();
        Contact c1 = new Contact(name, number);
        contacts[count++]=c1;
    }

    @Override
    public void listContact() {
        for (int i = 0; i < count; i++) {
            System.out.println(contacts[i]);

        }
    }

    @Override
    public void deleteContact() {

    }

    @Override
    public void editContact() {

    }

    @Override
    public void searchContact() {

    }
}
