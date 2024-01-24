package day05_practice_tasks;

public class ForNumber1_2 {
    public static void main(String[] args) {


        for (int i = 1; i < 11; i++) {

            if (i % 2 == 0){
                System.out.print(i + " ");

            }

        }
        System.out.println();
        System.out.println("_________________________________________");

        System.out.print(1);
        for (int i = 3; i <= 19; i++) {
            if (i % 2 == 1){
                System.out.print("-" + i);
            }

        }
        System.out.println();
        System.out.println("_________________________________________");

        

    }
}
