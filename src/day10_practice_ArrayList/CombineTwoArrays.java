package day10_practice_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoArrays {
    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr1));
        list.addAll(Arrays.asList(arr2));
        System.out.println(list);

        //System.out.print("list ==> {\"");
        System.out.print(String.join("\", \"", list));
        //System.out.println("\"}");

    }
}
/*

4. Create a class called CombineTwoArrays and write a program with the following specifications:
   4.1 Given two String arrays, combine them into one ArrayList.

                Example:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};

                Output:
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}

 */