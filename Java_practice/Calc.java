package Java_practice;

/* byte + byte -> int
char + char -> int
short + byte -> int
int + int -> int
int + long -> long
*/
public class Calc {
    public static void main(String[] args) {
        double a = 6;
        double b = 5;
        double sum = a+b;
        System.out.printf("Sum is %f\n",sum);

        double sub = a-b;
        System.out.println("Subtraction is: "+sub);

        double mul = a*b;
        System.out.println("Multiplication is "+mul);

        double div = a/b;
        System.out.println("Java_practice.Division is "+div);

        double mod = a%b;
        System.out.println("Modulus is "+mod);
    }
}
