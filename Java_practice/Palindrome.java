package Java_practice;

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = sc.next();

        StringBuilder sb = new StringBuilder(name);
        String rev_user_input = sb.reverse().toString();
        if(name.equalsIgnoreCase(rev_user_input)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("It is not Palindrome");
        }
    }
}
