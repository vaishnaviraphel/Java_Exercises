package Java_practice;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = d.nextLine();
        name = name.toLowerCase();
        switch(name){
            case "Chrome":
                System.out.println("Open the chrome browser");
                break;
            case "Firefox":
                System.out.println("Open the Firefox");
                break;
            default:
                System.out.println("Check again");
        }
        d.close();
    }
}
