package day16_practice_collection;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {


        List<Integer> number = new ArrayList<>(Arrays.asList(20, 15, 10, 20, 30, 10, 20, 15, 0));

        Set<Integer> uniqnumber = new TreeSet<>(number);

        System.out.println(uniqnumber);


    }
}
/*
1. Create a class named RemoveDuplicates and write a program that
takes a list of integers, removes any duplicate values, and returns
the elements in sorted order.

         Example:
            {20, 15, 10, 20, 30, 10, 20, 15, 0}

         Output:
            {0, 10, 15, 20, 30}
 */