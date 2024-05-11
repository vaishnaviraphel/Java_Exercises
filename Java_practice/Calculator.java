package Java_practice;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number1: ");
        double num1 = sc.nextInt();
        System.out.println("Enter your number2: ");
        double num2 = sc.nextInt();
        System.out.println("Enter your number3: ");
        double num3 = sc.nextInt();

        sc.close();
    }
}