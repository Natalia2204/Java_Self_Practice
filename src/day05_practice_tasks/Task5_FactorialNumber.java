package day05_practice_tasks;

public class Task5_FactorialNumber {
    public static void main(String[] args) {

        int num = 5;
        int factorial = 1;

        for (int i = num; i >=1 ; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }


}
/*
Create a class named FactorialNumber. Write a program that can
return the factorial number of any given number.

				Example:
					  num = 5

				Output:
					  120

			(because: 5! = 5 * 4 * 3 * 2* 1 = 120 )

 */
