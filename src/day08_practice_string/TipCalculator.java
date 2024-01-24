package day08_practice_string;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Split or No split ? ");

        String splitBill = input.nextLine();

        System.out.println("Enter the number of people: ");

        int numberPeople = input.nextInt();

        System.out.println("Enter the check amount: ");

        double checkAmount = input.nextDouble();
        input.nextLine();

        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");

        String serviceQuality = input.nextLine();

        double tipPercentage = 0;
        switch (serviceQuality) {
            case "Excellent" -> tipPercentage = 0.25;
            case "Great" -> tipPercentage = 0.20;
            case "Good" -> tipPercentage = 0.15;
            case "Fair" -> tipPercentage = 0.10;
            case "Poor" -> tipPercentage = 0.05;
        }

        double totalTip = checkAmount * tipPercentage;
        double totalPay = checkAmount + totalTip;

        System.out.println("Number of people entered: " + numberPeople + "\nTotal to pay: " + totalPay +
                "\nTotal tip:  " + totalTip);

        if (splitBill.equals("Yes")) {
            double totalPerPerson = totalPay / numberPeople;
            double tipPerPerson = totalTip / numberPeople;

            System.out.println("Total per person: " + totalPerPerson + "\nTip per person: " + tipPerPerson);
        }
    }
}
/*
Create a class called TipCalculator and write a program for a tip calculator. There will be different service
quality benchmarks that will determine the tip given. There will also be the ability to calculate based on the
number of people in the party and whether there is a split of the bill.
 //Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%


      The program should ask the user to enter:
          - Split or No split (Yes or No),
          - Enter the number of people (number)
          - Enter the check amount (number)
          - Service Quality (String)

      And display the output in the following format:

            Example:
                  Split or No Split (Yes or No)?
                  Input: Yes
                  Enter the number of people:
                  Input: 4
                  Enter the check amount:
                  Input: 476
                  How was the service quality? (Excellent/Great/Good/Fair/Poor)
                  Input: Excellent

            Output:
                 Number of people entered: 4
                 Total to pay: 595.0
                 Total tip: 119.0
                 Total per person: 148.75
                 Tip per person: 29.75

 */
//Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%
        /* if (serviceQuality.equals("Excellent")) {
            totalTip = checkAmount * 0.25;
        } else if (serviceQuality.equals("Great")) {
            totalTip = checkAmount * 0.20;
        } else if (serviceQuality.equals("Good")) {
            totalTip = checkAmount * 0.15;
        } else if (serviceQuality.equals("Fair ")) {
            totalTip = checkAmount * 0.10;
        } else if (serviceQuality.equals("Poor ")) {
            totalTip = checkAmount * 0.05;
        } */

 /* double tipPercentage = switch (serviceQuality) {
            case "Excellent" -> 0.25;
            case "Great" -> 0.20;
            case "Good" -> 0.15;
            case "Fair" -> 0.10;
            default -> 0.05;
        };
*/