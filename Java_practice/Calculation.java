package Java_practice;

//Write a Java program to print the results of the following operations.
//Test Data:
//a. -5 + 8 * 6
//b. (55+9) % 9
//c. 20 + -3*5 / 8
//d. 5 + 15 / 3 * 2 - 8 % 3
public class Calculation {
    public static void main(String[] args) {
        //(a)
        double a = -5;
        double b = 8;
        double c = 6;
        System.out.println(a+b*c);
        //(b)
        double d = 55;
        double e = 9;
        double f = 9;
        System.out.println((d+e)%f);
        //(c)
        double g = 20;
        double h = -3;
        double i = 5;
        double j = 8;
        System.out.println(g+h*i/j);
        //(d)
        double k = 5;
        double l = 15;
        double m = 3;
        double n = 2;
        double o = 8;
        double p = 3;
        System.out.println(k+l/m*n-o%p);
    }
}