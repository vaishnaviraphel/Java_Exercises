package Java_practice;

public class Ternory {
    public static void main(String[] args) {
        int a = true ? 10: 20;
        int a1 = (30> 40) ? 10 : 20;
        System.out.println(a1);

        String str = 10>20 ? "10" : "Twenty";
        System.out.println(str);

        int x = 10;
        int y = 50;
        int max = x<y ? y :x;
        int min = x<y ? x : y;
        System.out.println(max);
        System.out.println(min);
    }
}
