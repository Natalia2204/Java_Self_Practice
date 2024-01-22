package practice_replit;

import java.util.Scanner;

public class EmailSeparate {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        email = email.toLowerCase();

        String firstName = email.substring(0,email.indexOf('_'));
        String lastName = email.substring(email.indexOf('_')+1, email.indexOf('@'));
        String domain = email.substring(email.indexOf('@')+1, email.indexOf('.'));


        System.out.println("First name: " + firstName.toUpperCase().substring(0,1) + firstName.substring(1));
        System.out.println("Last name: " + lastName.toUpperCase().substring(0,1) + lastName.substring(1));
        System.out.println("Domain: " + domain.toUpperCase().substring(0,1) + domain.substring(1));
    }
}
/*
Use String methods to divide the given email into separate parts. The email will always be in this format:
firstName_lastName@domain.com
Pull apart and print the first name, last name, and domain. When printing the values
all three should be in proper capitalization format
- The first letter of each word is uppercase and the rest are lowercase. Output in the following format:
Hint: Think about how to use substring and indexOf together
Ex:
  Input:
    jeff_bezos@amazon.us
  Output:
    First name: Jeff
    Last name: Bezos
    Domain: Amazon

Ex:
  Input:
    sergey_brin@gmail.com
  Output:
    First name: Sergey
    Last name: Brin
    Domain: Gmail
 */