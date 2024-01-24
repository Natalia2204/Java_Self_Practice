package WeekMoning4;

import java.util.Scanner;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "aabbbcccc";
        String result = " ";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int frequency = 0;

            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)){
                    frequency++;
                }
            }
            if(!result.contains(ch + "" + frequency))
                result += ch + "" + frequency;
            }
            System.out.println(result);
        }
    }

/*
2. Frequency of Characters Task:
Write a program to display the frequency of each character in a given string.
   Example:
     str = "aabbbcccc"
   Output:
     a2b3c4
 */