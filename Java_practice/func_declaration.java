package Java_practice;

public class func_declaration {
    public static void main(String[] args) {
        double result = sum();
        System.out.println(result);
        double s1 = multi(3.5,4.6);
        System.out.println(s1);
        double s2 = multi(1.0,5.0);
        System.out.println(s2);
        String n1 = n("Number ",10);
        System.out.println(n1);
    }
    static int sum(){
        return 4+10;
    }
    static double multi(double a, double b){
        return a*b;
    }
    static String n(String c, int d){
        return c+d;
    }
}
