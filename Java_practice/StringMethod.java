package Java_practice;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;

// Primitive DataType - int,byte,short
// Non-Primitive - String and others who have other functions/features
public class StringMethod {
    public static void main(String[] args) {
        String name = "Vaishnavi";
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        //string is immutable: you can't change

        String n1 = "School";
        String n2 = "school";
        //System.out.println(n1 == n2);
        //System.out.println(n1.equals(n2));

//        char c = n1.charAt(2);
//        System.out.println(c);
//        boolean result = n1.contains("y");
//        System.out.println(result);
//        n1 = n1.concat("mate");
//        System.out.println(n1);

        String c1 = "Job@2024";
        String c2 = c1.toLowerCase();
        //System.out.println(c1 == c2);
        //System.out.println(c1.equals(c2));
        System.out.println(c1.equalsIgnoreCase(c2));
        System.out.println(c1.substring(0,6));
        System.out.println(c1.indexOf("@"));
    }
}
// StringBuffer and StringBuilder are two another methods where we can make changes. String is immutable.
// StringBuilder is not thread-safe. StringBuffer is thread-safe. So we can add method like append, lowercase etc.
// StringBuffer.reverse()