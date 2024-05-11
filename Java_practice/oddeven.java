package Java_practice;

import java.util.Scanner;
public class oddeven {
    public static void main(String[] args) {
//        int a = 3;
//        if(a%2==0){
//            System.out.println(a+ " is even number");
//        }
//        else{
//            System.out.println(a+" is odd number");
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println(num+ " is even");
        }
        else{
            System.out.println(num+ " is odd");
        }
        sc.close();
    }
}
