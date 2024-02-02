package day10_practice_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class SameFirstAndLast {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));


        for (int i = 0; i < list.size(); i++) {

            if(list.get(i).toLowerCase().charAt(0) == list.get(i).charAt(list.get(i).length()-1)){
                list.remove(i);
                i--;
            }

        }
        System.out.println(list);

    }
}

            //System.out.println(list.get(i));
            //System.out.println(list.get(i).charAt(0));



/*
11. Create a class called SameFirstAndLast and write a program with the following specifications:
    11.1 Given an ArrayList of strings, remove elements if the first and last characters of the string are the same.

			Example:
				list = {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"}

			output:
				["Lan", "Ebrahim", "Farida"]
 */