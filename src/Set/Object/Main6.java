package Set.Object;

import java.util.HashSet;
import java.util.Set;

public class Main6 {
    public static void main(String[] args) {
        Set<Account> set = new HashSet<>();
        set.add(new Account("Abdugani",22));
        set.add(new Account("Java",23));
        set.add(new Account("Jeck",21));
        set.add(new Account("Abdugani",22));
        System.out.println(set.size());
        System.out.println(set);
    }
}
