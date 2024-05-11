package Java_practice;

public class functions_4 {
    public static void main(String[] args) {
        // Non return with no parameter
        first();
        // Non return with parameter
        second("World");
        // Return with no parameter
        third( 9,5);
        // Return with parameter
        double mul=fourth(4.0,5.0);
        System.out.println(mul);
    }
    static void first(){
        System.out.println("No value");
    }
    static void second(String name){
        System.out.println("Hello "+name);
    }
    static void third(int a, int b){
        System.out.println(a-b);
    }
    static double fourth(double c,double d){
        return c*d;
    }
}
