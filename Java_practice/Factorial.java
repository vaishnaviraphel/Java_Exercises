package Java_practice;

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        long fact = 1;
        System.out.print("Enter number: ");
        int n = s.nextInt();
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println(fact);
        s.close();
    }
}