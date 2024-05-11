package Java_practice;

import java.util.Scanner;
public class func_Calc {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1= sc.nextInt();
        System.out.print("Enter second number: ");
        int n2=sc.nextInt();
        int add = sum(n1,n2);
        System.out.println(add);
        int minus = sub(n1,n2);
        System.out.println(minus);
        int multiply = mul(n1,n2);
        System.out.println(multiply);
        int division = div(n1,n2);
        System.out.println(division);

        // this will add mentioned number separately.
        int add1 = sum(3,4);
        System.out.println(add1);
    }
    static int sum(int a,int b){
        return a+b;
    }
    static int sub(int c,int d){
        return c-d;
    }
    static int mul(int e,int f){
        return e*f;
    }
    static int div(int g,int h){
        return g/h;
    }
}
