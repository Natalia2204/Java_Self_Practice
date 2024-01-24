package day08_practice_string;

import java.util.Scanner;

public class FullNameFormat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first name: ");

        String firstName = input.nextLine();

        System.out.println("Enter last name: ");
        String lastName = input.nextLine();

        System.out.println("Output:\n" + formatName(firstName)+ " " + formatName(lastName) );

        input.close();
    }

    public static String formatName(String name) {
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }
}

/*
6. Write a program that asks the user to enter first and last names and then prints the full name in regular format
(first character in uppercase).

        Example:
              Input:
                  firstName = "cyDEo";
                  lastName = "SCHOOL";

              Output:
                   Cydeo School
 */
