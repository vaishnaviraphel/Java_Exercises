package Java_practice;//Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
//Sample Output:
//
//Input the first number : 5
//Input the second number: 10
//Input the third number : 15
//The result is: true
import java.util.Scanner;
public class third_same {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("First number: ");
        int n1=sc.nextInt();
        System.out.print("Second number: ");
        int n2=sc.nextInt();
        System.out.print("Third number: ");
        int n3=sc.nextInt();

        System.out.println("The result is: "+sum(n1,n2,n3));
    }
    static boolean sum(int a,int b, int c){
        return ((a+b)==c || (a+c)==b || (b+c)==a);
    }
}
