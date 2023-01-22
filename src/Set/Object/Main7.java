package Set.Object;

import java.util.HashSet;
import java.util.Set;

public class Main7 {
    public static void main(String[] args) {
        Set<Account> set = new HashSet<>();
        Account a = new Account("Abdugani",22);
        set.add(a);
        set.add(new Account("Java",23));
        set.add(new Account("Jeck",21));
        set.add(new Account("Abdugani",22));
        System.out.println(set.contains(a));
        System.out.println(set.contains(new Account("Abdugani",22)));
    }
}
