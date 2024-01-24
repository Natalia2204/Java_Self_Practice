package day04_practice_tasks;

public class OxygenTank {
    public static void main(String[] args) {

       int oxygenLevel = 90;

       switch (oxygenLevel){
           case 50 -> System.out.println("Be careful, you're at 50%");
           case 60 -> System.out.println("Start to head back");
           case 70 -> System.out.println("Don't go too far");
           case 80 -> System.out.println("Still okay");
           case 90 -> System.out.println("Your tank is full");

           default -> System.out.println("Invalid Level");
       }


    }
}
