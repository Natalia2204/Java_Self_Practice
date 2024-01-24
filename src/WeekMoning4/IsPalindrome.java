package WeekMoning4;

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        String word1 = word.toLowerCase();
        int lengthWord = word1.length();
        int middleIndexWord = lengthWord/2;


        System.out.println(middleIndexWord);
        System.out.println(word1.charAt(0));
        System.out.println(word1.charAt(middleIndexWord));
        System.out.println(word1.charAt((lengthWord)-1));


       for (int i = 0; i <middleIndexWord; i++) {
            if (!(word1.charAt(i) == word1.charAt((lengthWord)-1))) {
                System.out.println("false");
                return;
            } else {
                lengthWord = lengthWord -1;
            }
        }
        System.out.println("true");

    }

}
/*
1.2 Develop a method named isPalindrome to check if a given string is a palindrome.
			Example:
			 	isPalindrome("Level");

			Output:
			 	true
 */