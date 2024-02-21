package day16_practice_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemovePalindromes {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
                "reviver", "racecar", "madam");

        List<String> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (!isPalindrome(list.get(i))) {
                result.add(list.get(i));
            }
        }
        System.out.println(result);
    }

    public static boolean isPalindrome(String str) {
        String strLC = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            if (strLC.charAt(i) != strLC.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}

/*
Create a class named RemovePalindromes and write a program that removes all palindrome
strings from a given list of strings. The removal should be performed without using the removeIf method.

         Example:
            list = {"Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
                     "reviver", "racecar", "madam"}

         Output:
            {"Java", "Python", "Cydeo", "Car"}
            // List<String> result = list.stream().filter((str) -> !isPalindrome(str)).toList();
 */