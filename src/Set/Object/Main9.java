package Set.Object;

import java.util.Set;
import java.util.TreeSet;

public class Main9 {
    public static void main(String[] args) {
        Set<Account> set = new TreeSet<>();
        set.add(new Account("Abdugani",22));
        set.add(new Account("Javaphile",21));
        set.add(new Account("Java",23));
        set.add(new Account("Jeck",24));
        System.out.println(set);
    }
}
