package Java_practice;

import java.sql.SQLOutput;

public class Operators {
    public static void main(String[] args) {
        //Arithmetic operator (+,-,*,/)
        int a = 10;
        int b = 30;
        System.out.println(a+b);

        //Compound Assignment Operator (+=,-=,/=,*=,%=)
        int c = 50;
        c = c + 10; // c += 10;
        System.out.println(c);

        //Relational Operator (>,<,>=,<=,==,!=)
        int age_a = 23;
        int age_b = 25;
        boolean result = age_a > age_b;
        System.out.println(result);

        //OR gate: 0 0 -> 0 else 1  and AND gate:

        // Logical Operator (AND gate, NOT gate, OR gate)
        boolean i = true;
        System.out.println(!i);
        System.out.println(!!(30<60));

        // Increment(++) and Decrement(--) (pre, post)
        int j = 25;
        int k = j--;

        // j++ and ++j, both have different value.
    }
}
