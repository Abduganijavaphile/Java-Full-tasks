package Constructer;

public class Developer {
    String name;
    double salary;
    String destination;
    double experience;

    Developer(){
        System.out.println("Hello world");
    }
    Developer(String n){
        name = n;
    }
    Developer(String n,double s){
        name = n;
        salary = s;
    }
    Developer(String n, double s, String d, double e){
        name = n;
        salary =s;
        destination = d;
        experience =e;
    }
}
