package day09_practice_tasks;

import java.util.Arrays;

public class ArrayElements {
    public static void main(String[] args) {
        //1.1 Create an array of integers with a length of 100.
        int [] numbers = new int[100];

        //1.2 Assign values from 1 to 100 to the indexes of the array.
        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = i + 1;
        }
        //1.3 Display the array elements in a single line separated by spaces.
        System.out.println(Arrays.toString(numbers).replace(',',' '));

        //1.4 Display the array elements in a single line in reversed order, separated by spaces.

        int [] reversNumbers = new int[numbers.length];

        for (int i = numbers.length - 1, j = 0; i >= 0; i--, j++) {
            reversNumbers[j] = numbers[i];
        }
        System.out.println(Arrays.toString(reversNumbers).replace(',',' '));

        //1.5 Display all evenly divisible elements by 5 in a single line separated by spaces.

        int number = 0;
        for (int j : numbers) {
            if (j % 5 == 0) {
                number = j;
                System.out.print(number+ " ");
            }

        }
    }



}
/*
1. Create a class named ArrayElements and write a program with the following specifications:
   1.1 Create an array of integers with a length of 100.
   1.2 Assign values from 1 to 100 to the indexes of the array.
   1.3 Display the array elements in a single line separated by spaces.
   1.4 Display the array elements in a single line in reversed order, separated by spaces.
   1.5 Display all evenly divisible elements by 5 in a single line separated by spaces.

 */