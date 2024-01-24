package day05_practice_tasks;

public class Task12_WhileSquare {
    public static void main(String[] args) {

        int num = 6;
        int i = 0;
        int j = 0;

        while (j <= num) {

            while (i <= num) {
                System.out.print(" * ");
                i++;
            }
            System.out.println(" * ");
            i = 0;
            j++;
        }
    }
}
