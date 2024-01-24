package Day06_practice_While;

public class Task9_ReturnOddEven {
    public static void main(String[] args) {

        numberOddEven(45);

    }

    public static void numberOddEven (int a){
        if (a % 2 == 0) {
            System.out.println(a + " is even number");
        }else {
            System.out.println(a + " is odd number");
        }

    }
}
