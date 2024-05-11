package Java_practice;

import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three sides of triangle");
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        int s3=sc.nextInt();

        if((s1==s2) && (s1==s3) && (s2==s3)){
            System.out.println("Equal");
        }
        else if((s1==s2) || (s1==s3) || (s2==s3)){
            System.out.println("Iso");
        }
        else{
            System.out.println("Scalene");
        }
    }
}