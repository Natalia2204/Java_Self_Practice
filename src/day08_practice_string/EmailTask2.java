package day08_practice_string;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter email address: ");

        String email = input.nextLine();

        int indexUnderscore = email.indexOf('_');
        int indexAt = email.indexOf('@');
        int indexDot = email.indexOf('.');

        String firstName = email.substring(0, indexUnderscore);
        String lastName = email.substring(indexUnderscore + 1, indexAt);
        String domain = email.substring(indexAt + 1, indexDot);

        System.out.println("Output:\n" + "First name: " + formatName(firstName) + "\n" + "Last name: "
                + formatName(lastName) + "\n" + "Domain: " + domain);
        input.close();
    }

    public static String formatName(String name) {
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }

}

/*
public static String formatName(String name) {
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();

Create a class called EmailTask2. Assume that the email address is constructed by a person's first name followed
by an underscore and last name. Write a program that will print out information about the user based on the email.
Print the first name, last name, and domain. First and last names should be printed with the proper format.
(uppercase first letter and remaining lowercase)

        Example:
              Input:
                 craig_federighi@apple.com

              Output:
                   First name: Craig
                   Last name: Federighi
                   Domain: apple
 */