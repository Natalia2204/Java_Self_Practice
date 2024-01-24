package day05_practice_tasks;

public class Fibonacci_6 {
    public static void main(String[] args) {

      /*  int num2 = 1;


        for (int num1 = 0; num1 <= 13; ) {

            System.out.print(num1 + " ");
            int sum = num1 + num2;

            num1 = num2;
            num2 = sum;
        }
*/

        int num1 = 0;
        int num2 = 1;
        int sum = 0;

        for (int i = 1; i <= 9; i++) {
            System.out.print(num1 + " ");
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;


        }

    }
}
