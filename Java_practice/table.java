package Java_practice;

import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        for(int j=1;j<=10;j++){
            System.out.println(+n+ "*" +j+ "=" +(n*j));
        }
    }
}
