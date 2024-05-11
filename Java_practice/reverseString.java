package Java_practice;

import java.util.Scanner;
public class reverseString {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter your name: ");
        char[] name = a.nextLine().toCharArray();
        for(int j=0; j<name.length+1;j++){
            System.out.print(name[j]);
        }
        System.out.println("Reverse String: ");
        for(int i= name.length;i>0;i--){
            System.out.print(name[i]);
        }
        System.out.println(" ");
    }
}
