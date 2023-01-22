package Madificators.Package2;

public class Main {
    public static void main(String[] args) {
        Company c1 = new Company("Crona","Multe","harnes");
        Geo g1 = new Geo("-37.3159","81.1496");
        Adress a1 = new Adress("Kulas Light","Apt. 556","Gwenborough","92998-3874",g1);
        Person p1 = new Person(1,"Leanne Graham","Bret","Sincere@aprel.biz",a1,"91 6399369","hildergard.org",c1);
        System.out.println(p1);
    }
}
