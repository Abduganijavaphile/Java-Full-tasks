package Lesson14Palimorfizm;

public class MyMax {
    public void max(int a, int b){
        if(a>b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }
    public void max(int c, double d){
        if(c>d){
            System.out.println(c);
        }else{
            System.out.println(d);
        }
    }
}
