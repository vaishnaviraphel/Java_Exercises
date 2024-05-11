package Java_practice;

import java.util.Scanner;
public class vowel {
    public static void main(String[] args) {
        System.out.println("Enter the name and first letter of that wil print out: ");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().toCharArray()[0];
        System.out.println(c);

        switch(c){
            case 'a':
                System.out.println("It's a vowel");
                break;
            case 'e':
                System.out.println("It's a vowel");
                break;
            case 'i':
                System.out.println("It's a vowel");
                break;
            case 'o':
                System.out.println("It's a vowel");
                break;
            case 'u':
                System.out.println("It's a vowel");
                break;
            default:
                System.out.println("It's a consonant");
        }
        sc.close();
    }

}
