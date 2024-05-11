package Java_practice;

import java.util.Scanner;
import java.math.*;
public class radius_math {
    public static void main(String[] args) {
        // Circle
//        double pi = 3.14159;
//        double r = 7.5;
//        System.out.println("Area of Circle is: "+(pi*r*r));
//        System.out.println("Perimeter is: "+(2*pi*r));

        //Average
        Scanner sc= new Scanner(System.in);
//        System.out.println("First no.: ");
//        double n1 = sc.nextDouble();
//        System.out.println("Second no.: ");
//        double n2 = sc.nextDouble();
//        System.out.println("Third no.: ");
//        double n3 = sc.nextDouble();
//
//        double average = (n1+n2+n3)/3;
//        System.out.println(average);

        //Swap two numbers
//        System.out.println("Enter number1: ");
//        int s1 = sc.nextInt();
//        System.out.println("Enter number2: ");
//        int s2 = sc.nextInt();
//        System.out.println("Before Swapping: "+s1+ " "+s2);
//        int s3 = s1;
//        s1 = s2;
//        s2 = s3;
//        System.out.println("After Swapping: "+s1+ " "+s2);

        //Hexagon area
        System.out.println("Enter side of hexagon: ");
        double h = sc.nextDouble();
        System.out.println("Area of hexagon is: "+(6*(h*h)/(4*Math.tan(Math.PI/6))));

    }
}
