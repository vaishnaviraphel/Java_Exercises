package Java_practice;

public class maxinarray {
    public static void main(String[] args) {
        int[] sal = {34,56,-9,100,58,24,89};
        int max_sal = Integer.MIN_VALUE;
        for(int i =0; i < sal.length; i++){
            if(sal[i]>max_sal){
                max_sal = sal[i];
            }
        }
        System.out.println(max_sal);
    }
}
