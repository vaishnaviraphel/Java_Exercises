package Java_practice;

public class Arrays {
    public static void main(String[] args) {
//        int[] ages = {23,15,24,27,18};
//        // Second method of defining array
//
//        int[] ages2 = new int[3]; // size always starts {"1"}.
//        ages2[0] = 23; // index always starts with {"0"}.
//        ages2[1] = 16;
//        ages2[2] = 12;
//        System.out.println(ages2[2]);
//        System.out.println(ages2.length);

        String[] breakfasts = new String[4];
        breakfasts[0] = "Cereals";
        breakfasts[1] = "Biscuit Tea";
        breakfasts[2] = "Croissant";
        breakfasts[3] = "Milk";
        for(int i=0;i< breakfasts.length;i++){
            System.out.println(breakfasts[i]);
        }
    }
}
