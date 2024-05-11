package Java_practice;

/*
*  %d -> any int,byte,short,double and long
*  %s -> string
*  %c -> char
*  %f -> float
* */
public class practicevar {
    public static void main(String[] args) {
        int age = 23;
        System.out.printf("My age is: %d\n",age);
        System.out.println("Your age is "+age);
        float num = 3465.78f;
        System.out.printf("Car number is %f\n",num);
        String name = "Vaishnavi";
        System.out.printf("My name is %s\n",name);
        final float pi = 3.14f; // value remain same. We can't change the value.
        System.out.println("value of pi"+pi);

        char c = '\u1F22';
        System.out.println(c);


        int a = 10; // Decimal
        int b = 0b101; //Binary
        int o = 0101; //octal
        int hex = 0Xface; // hexadecimal


        String name1 = "Raphel";// Assignment operator
        String name2 = new String("Jose");// new operator
        // Both takes different memory to save name.
    }
}
