package day08_practice_string;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" Enter email: ");
        String mail = input.nextLine();

        String firstName = mail.substring(0,mail.indexOf('_'));


        String lastName = mail.substring(mail.indexOf('_')+1, mail.indexOf('@'));


        String domain = mail.substring(mail.indexOf('@')+1, mail.indexOf('.'));
        System.out.println(domain);

        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        System.out.println(firstName);

        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
        System.out.println(lastName);




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