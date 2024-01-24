package day03_practice_tasks;

public class SwapValues {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int temp;

      //  temp = num1;
      //  num1 = num2;
      //  num2 = temp;

      num2 = num2 + num1;
      num1 = num2 - num1;
      num2 = num2 - num1;


        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);


    }
}
