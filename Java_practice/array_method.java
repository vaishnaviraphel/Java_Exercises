package Java_practice;

public class array_method {
    public static void main(String[] args) {
        int[] a1 = {34,5,78,45};
        int[] a2 = {45,60,15,45};

        System.out.println(a1==a2); // reference(where it got stored)

        int[] a3= a2;
        System.out.println(a2==a3);
        System.out.println(a2.equals(a3));
    }
}