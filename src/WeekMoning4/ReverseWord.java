package WeekMoning4;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String original = input.nextLine();


        StringBuilder reverse = new StringBuilder(original);
        System.out.println(reverse.reverse());



    }
}
/*
1. String Reverse & Palindrome Task:

	1.1 Create a method to reverse a given string and provide the reversed result.
			Example:
			 	reverse("Cydeo");
			Output:
			 	"oedyC"

	1.2 Develop a method named isPalindrome to check if a given string is a palindrome.
			Example:
			 	isPalindrome("Level");

			Output:
			 	true



2. Frequency of Characters Task:
Write a program to display the frequency of each character in a given string.
   Example:
     str = "aabbbcccc"
   Output:
     a2b3c4
 */