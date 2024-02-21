package day16_practice_collection;

import java.util.*;

public class CommonElements {
    public static void main(String[] args) {

        Set<Integer> set1 = new TreeSet<>();
        set1.addAll(Arrays.asList(10, 8, 11, 20, 5, 0));

        Set<Integer> set2 = new TreeSet<>();
        set2.addAll(Arrays.asList(30, 0, 20, 40, 50, 10, 60));

        Set<Integer> set3 = new TreeSet<>();

        for (Integer each1 : set1) {
            for (Integer each2 : set2) {
                if(each1 == each2){
                  set3.add(each1);
                }
            }
        }
        System.out.println(set3);
    }
}
/*
3. Create a class named CommonElements and write a program that identifies the common
elements in two given sets of integers and returns a third set containing these
common elements.

         Example:
            set1 = {10, 8, 11, 20, 5, 0}
            set2 = {30, 0, 20, 40, 50, 10, 60}

         Output:
            set3 = {0, 10, 20}
 */