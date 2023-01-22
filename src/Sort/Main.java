package Sort;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Contact[] contacts = new Contact[100];
        int count = 0;
        contacts[count++] = new Contact("Abdugani","123");
        contacts[count++] = new Contact("Java","124");
        contacts[count++] = new Contact("Cofe","125");

        Arrays.sort(contacts, 0, count);
        System.out.println(Arrays.deepToString(contacts));
        System.out.println("======");

        List<Contact> contactList = new ArrayList<>();
        contactList.add(new Contact("Abdugani","123"));
        contactList.add(new Contact("Java","124"));
        contactList.add(new Contact("Cofe","123"));
        Collections.sort(contactList);
        System.out.println(contactList);
    }
}
