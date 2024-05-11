package Java_practice;

public class Array_calc {
    public static void main(String[] args) {
        // double the salaries
        int salaries[] = {25,65,75,100};
        for(int i = 0; i< salaries.length; i++ ){
            System.out.println(salaries[i]*2);
        }

        int[] a = {12,34,56,31};
        double[] b = {12.4,34.7,56.6,31.3};
        long[] c = {12l,34l,56l,31l};
        float[] d= {34.6f,67.6f,34.9f,34.5f};

        String[] e = {"Adfrbg","fngirhtig", "rtuhtiug"}; // this is same as main(String[] args)
        boolean[] f = {true,false,true,false};
        char[] g = {'q','t','y'};

        System.out.println(args[0]);
    }

}
