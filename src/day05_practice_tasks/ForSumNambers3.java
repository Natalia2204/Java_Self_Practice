package day05_practice_tasks;

public class ForSumNambers3 {
    public static void main(String[] args) {
            int sumEven = 0;
            int sumOdd = 0;

       for (int i = 1; i < 10; ++i) {
           if (i % 2 == 0) {
               sumEven += i;
           }else {
               sumOdd += i;
           }
       }

       System.out.println("Sum of even number =  " + sumEven);
       System.out.println("Sum of odd number =  " + sumOdd);

    }
}
