package Day06_practice_While;

public class Task1_OddAndEven {
    public static void main(String[] args) {

        boolean result = isOdd(100);
        System.out.println(result);

        System.out.println("______________________________________");

        boolean result1 = isEven(100);
        System.out.println(result1);
    }
    public static boolean isOdd(int number) {
        if (number % 2 == 0) {
            return false;
        }
        return true;
    }

    public static boolean isEven(int number1){
        if (number1 % 2 == 0) {
            return true;
        }
        return false;

    }
}
/*
1. Create a class named OddAndEven:

	1.1 Create a method named isOdd that returns true if a number is odd. Otherwise, it returns false.

			Example:
				boolean result = isOdd(100);

			Output:
				false

	1.2 Create a method named isEven that returns true if a number is even. Otherwise, it returns false.

			Example:
				boolean result = isEven(100);

			Output:
				true

 */