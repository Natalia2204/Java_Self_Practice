package day08_practice_string;

import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = input.nextLine();

        word = word.replace("x","a");

        input.close();

        System.out.println("Output: " + word);



    }



}
/*
1. Create a class named StartsWithX and write a program that asks the user to enter a word.
If the word starts with 'x,' replace it with 'a'.

        Example:
              Input:
                 xcodex

              Output:
                 acodex
 */