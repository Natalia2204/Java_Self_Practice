package day08_practice_string;

import java.util.Scanner;

public class EmailTask1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input: ");

        String email = input.nextLine();

        if (email.contains("_")) {

            int indexUnderscore = email.indexOf('_');
            int indexAt = email.indexOf('@');

            String firstName =  email.substring(0, indexUnderscore);
            String lastName = email.substring(indexUnderscore + 1, indexAt);
            String domain = email.substring(indexAt + 1);

            System.out.println("Output: " + lastName + "_" + firstName + "@" + domain);
        } else {
            System.out.println("Output: " + email);
        }
        input.close();
    }
}

//email.length()
/*
. Create a class called EmailTask1. Assume that the email address is constructed by a person's first name followed
by an underscore and last name. Write a program that can swap the first name with the last name in the email
(separated by an underscore). If the email doesn't contain an underscore, print the given input email.

        Example:
              Input:
                 mike_tyson@gmail.com

              Output:
                  tyson_mike@gmail.com


 */