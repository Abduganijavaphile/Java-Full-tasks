package Sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactServiceImpl implements ContactService{


    private List<Contact> contactList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    @Override
    public void addContact() {
        System.out.print("name: ");
        String name = scanner.next();
        System.out.print("number: ");
        String number = scanner.next();
        Contact c1 = new Contact(name,number);
        contactList.add(c1);
    }

    @Override
    public void list() {
        for (Contact contact : contactList) {
            System.out.println(contact);
        }
    }

    @Override
    public void deleteContact() {
        for (int i = 0; i < contactList.size(); i++) {
            System.out.println((i+1) + " -> " + contactList.get(i));
        }
        int n = scanner.nextInt();
        contactList.remove(n);
    }

    @Override
    public void searchContact() {
        System.out.println("name: ");
        String name = scanner.next();
        for (int i = 0; i < contactList.size(); i++) {
            if(contactList.get(i).getName().contains(name)){
                System.out.println(contactList.get(i));
            }
        }
    }

    @Override
    public void editContact() {
        for (int i = 0; i < contactList.size(); i++) {
            System.out.println((i+1) + " -> " + contactList.get(i));
        }
        int n = scanner.nextInt();

        System.out.println("New contact name: ");
        String name = scanner.next();
        System.out.println("new contact number: ");
        String number = scanner.next();
        //contactList.get(n).setName(name);
        //contactList.get(n).setNumber(number);

        contactList.set(n, new Contact(name, number));
    }
}
