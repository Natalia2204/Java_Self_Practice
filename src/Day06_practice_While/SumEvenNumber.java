package Day06_practice_While;

public class SumEvenNumber {
    public static void main(String[] args) {

        int num = 2;
        int sumEven = 0;

        while (num <= 10) {
            if (num % 2 == 0){
                sumEven = sumEven + num;
            }
            num++;
        }
        System.out.println("Sum of the nums " +  sumEven );
    }
}
