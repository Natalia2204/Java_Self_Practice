package day08_practice_string;

import java.util.Scanner;

public class CombineWords {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word: ");
        String firstWord = input.nextLine();

        System.out.println("Enter second word: ");
        String secondWord = input.nextLine();

        if (firstWord.charAt(firstWord.length()-1) == secondWord.charAt(0)){
            secondWord = secondWord.substring(1);
        }
        System.out.println(firstWord.concat(secondWord));
    }
}
/*
Create a class named CombineWords. Ask the user to enter two words. Then, add them together and print. But if the
last letter of the first word and the first letter of the second word are the same, print that character once.

        Example:
              Input:
                 one
                 eight

              Output:
                   oneight

 */