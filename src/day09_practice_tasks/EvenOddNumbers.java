package day09_practice_tasks;

public class EvenOddNumbers {
    public static void main(String[] args) {

        int [] numbers = {1, 2, 3, 4, 5, 6, 7};

        int countEvenNumber = 0;
        int countOddNumber = 0;

        for (int number : numbers) {
            if (number % 2 == 0) countEvenNumber += 1;
            if (number % 2 != 0) countOddNumber += 1;
        }
        System.out.println("The array has " +  countOddNumber +  " odd numbers and " + countEvenNumber + " even numbers.");
    }
}
/*
Create a class named EvenOddNumbers and write a program that counts the even and odd numbers from an array of integers.

			Example:
				array = {1, 2, 3, 4, 5, 6, 7};

			Output:
				The array has 4 odd numbers and 3 even numbers.
 */