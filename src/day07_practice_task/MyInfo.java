package day07_practice_task;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age ");
        int age = input.nextInt();

        System.out.println("Enter your gender ");
        String gender = input.next();

        input.nextLine();

        System.out.println("Enter your full name ");
        String fullname = input.nextLine();

        System.out.println("Enter your phone number ");
        long phonenumber = input.nextLong();

        input.nextLine();

        System.out.println("Enter your zip code ");
        int zipcode = input.nextInt();

        System.out.println("Enter your School name ");
        String schoolname = input.nextLine();

        input.nextLine();

        System.out.println("Enter your city name ");
        String cityname = input.nextLine();

        System.out.println("Enter your state name ");
        String statename = input.next();

        System.out.println("Enter your building number ");
        int buildingnumber = input.nextInt();
        input.nextLine();

        System.out.println("Enter your Street name ");
        String streetname = input.nextLine();

        System.out.println(fullname + "\n" + age + "\n" + gender + "\n" + phonenumber + "\n"+ "Address: " + "\n\t" +
                buildingnumber + " " + streetname + "\n\t" + cityname + ", " + zipcode);

        input.close();
    }
}
/*
Create a class called MyInfo and ask the user to:

      Enter your age (int)
      Enter your gender (String - One word ONLY)
      Enter your full name (String - Multiple words)
      Enter your phone number (long)
      Enter your zip code (int)
      Enter your School name (String - Can be Multiple words)
      Enter your city name (String - Can be Multiple words)
      Enter your state name (String - One word ONLY)
      Enter your building number (int)
      Enter your Street name

    Display all the inputs that the user entered in the following order in separate lines:

        Full name
        Age
        Gender
        Phone number
        Address:
             buildingNumber Street
             City, state zipCode
 */
