package Java_practice;

public class FizzBuzz {
    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.print("\t" + i);
            }
        }
        System.out.println(" ");
        for (int j = 1; j < 100; j++) {
            if (j % 5 == 0) {
                System.out.print("\t" + j);
            }
        }
        System.out.println(" ");
        for (int k = 1; k < 100; k++) {
            if (k % 3 == 0 && k % 5 == 0) {
                System.out.print("\t" + k);
            }
        }
    }
}
