package Java_practice;

public class Latestswitch {
    public static void main(String[] args) {
       int itemcode = 006;
      switch(itemcode){
          case 001,003,002:
              System.out.println("Electric Item");
              break;
          case 004,005,006:
              System.out.println("Household Item");
              break;
          case 007:
              System.out.println("Fashion");
              break;
          default:
                System.out.println("Groceries");
        }
    }
}