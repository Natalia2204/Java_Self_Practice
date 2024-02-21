package day16_practice_collection;

import java.util.Set;
import java.util.TreeSet;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "abcd";
        String str2 = "ccddabaa";
        boolean isAnagrams = true;

        Set<Character> set1 = new TreeSet<>();
        for (char each1 : str1.toCharArray()) {
            set1.add(each1);
        }
        Set<Character> set2 = new TreeSet<>();
        for (char each2 : str2.toCharArray()) {
            set2.add(each2);
        }

        if(set1.equals(set2)){
            isAnagrams = true;
        }else {
            isAnagrams = false;
        }

        System.out.println(isAnagrams);

    }
}
/*
5. Create a class named Anagram and write a program that checks if two strings are anagrams
of each other, considering only the distinct characters in each string (ignoring duplicates).

         Example1:
            str1 = "abcd"
            str2 = "ccddabaa"

         Output:
            true


         Example2:
            str1 = "xyze"
            str2 = "xyzd"

         Output:
            false

 */