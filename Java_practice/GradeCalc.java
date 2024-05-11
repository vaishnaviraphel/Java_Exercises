package Java_practice;

import java.util.Scanner;
public class GradeCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter percentage: ");
        int num = sc.nextInt();
        char grade = 'F';
        if(num>=90 && num<= 100) {
            grade = 'A';
        }
        else if(num>=70 && num<=89){
            grade = 'B';
        }
        else if(num>=50 && num<=69){
            grade = 'C';
        }
        else if(num<0 && num>100) {
            System.out.println("Wrong Input");;
        }
        else{
            grade = 'F';
        }
        System.out.println("Your grade is "+grade);
        sc.close();
    }
}