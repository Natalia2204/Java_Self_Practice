package day10_practice_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 5, 5, 7, 8, 8, 3, 3));
        ArrayList<Integer> rezult = new ArrayList<>();

        Collections.sort(list);
        Integer previous = null;

        for (Integer num : list) {
            if (num != previous) {
                rezult.add(num);
                previous = num;
            }
        }
        System.out.println(rezult);


    }
}
/*
8. Create a class called RemoveDuplicates and write a program with the following specifications:
   8.1 Given an ArrayList of integers, remove duplicated numbers.

			Example:
				list = [1,1,2,2,3,3,4,4,5,6,7]

			Output:
				[1,2,3,4,5,6,7]
 */