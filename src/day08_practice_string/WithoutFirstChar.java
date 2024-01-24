package day08_practice_string;

import java.util.Scanner;

public class WithoutFirstChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word: ");

        String firstword = input.nextLine();

        System.out.println("Enter second word: ");
        String secondword = input.nextLine();

        firstword = firstword.replace(firstword.charAt(0),  ' ');

        secondword = secondword.replace(secondword.charAt(0),  ' ');

        input.close();

        System.out.println("Output: " + "\n" + firstword  + secondword.trim());




    }
}
/*

2. Create a class named WithoutFirstChar. Ask the user to enter two words. Print the first word without its
first character, then print the second word without its first character.

        Example:
              Inputs:
                  apple
                  banana

              Output:
                   ppleanana
 */