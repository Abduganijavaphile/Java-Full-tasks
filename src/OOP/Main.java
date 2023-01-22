package OOP;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player();
        p1.name = "Cristiano";
        p1.nationality = "Portugal";
        p1.position = "Forward";

        System.out.println(p1.name);
        System.out.println(p1.nationality);
        System.out.println(p1.position);
        p1.run();
        System.out.println("======");
        Player p2 = new Player();
        p2.name = "Messi";
        p2.nationality = "Argentina";
        p2.position = "AmE";
        System.out.println(p2.name);
        System.out.println(p2.nationality);
        System.out.println(p2.position);
        p2.run();
    }
}