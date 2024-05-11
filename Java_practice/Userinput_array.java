package Java_practice;

import java.util.Scanner;
public class Userinput_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] m = new float[4];
        System.out.print("Enter first subject's marks: ");
        m[0] = sc.nextFloat();
        System.out.print("Enter second subject's marks: ");
        m[1] = sc.nextFloat();
        System.out.print("Enter third subject's marks: ");
        m[2] = sc.nextFloat();
        System.out.print("Enter fourth subject's marks: ");
        m[3] = sc.nextFloat();
        sc.close();
    }
}
