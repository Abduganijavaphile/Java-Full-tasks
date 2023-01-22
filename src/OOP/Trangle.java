package OOP;

public class Trangle {
    double a;
    double b;
    double c;

    void perimetr(){
        System.out.println(a + b + c);
    }
    void area(){
        double p1 = (a + b + c)/2;
        double S = Math.sqrt(p1*(p1-a)*(p1-b)*(p1-c));
        System.out.println(S);
    }
}
