package additional_tasks;

import java.util.Scanner;

public class CoffeeOrderApp {
    public static void main(String[] args) {
        double blackCoffeePrice = 4;
        double lattePrice = 5;
        double cappuccinoPrice = 6;
        double totalPrice = 0;

        //Step 1. Ask the user if they want to order coffee
        Scanner input = new Scanner(System.in);
        System.out.println("\tWelcome to the Coffee Order App!\n\nWould you like to order coffee? (Yes/No)");
        String answer = input.nextLine().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))) {
            System.err.println("Invalid entry, Please re-enter! Would you like to order coffee? (Yes/No)");
            answer = input.nextLine().toLowerCase();
        }
        if (answer.equals("no")) { // if the user does not want to order a coffee
            System.err.println("Thanks for using our service!");
            return;
        }
        String nextOder;
        double oderPrice = 0;
        do {
            //Step 2. Display the coffee options on the console
            System.out.println("1. Black Coffee - " + blackCoffeePrice);
            System.out.println("2. Latte - " + lattePrice);
            System.out.println("3. Cappuccino - " + cappuccinoPrice);

            // Step 3. Ask the user to pick a coffee
            System.out.println("Please to pick a coffee: (1, 2, 3)");
            String coffe = input.nextLine();

            while (!(coffe.equals("1") || coffe.equals("2") || coffe.equals("3"))) {
                System.err.println("Invalid entry, Please re-enter!");
                coffe = String.valueOf(input.nextInt());
            }
            if (coffe.equals("1")) {
                System.out.println("Added Black Coffee to Your Order.");
                oderPrice = blackCoffeePrice;
            }
            if (coffe.equals("2")) {
                System.out.println("Added Latte to Your Order.");
                oderPrice = lattePrice;
            }
            if (coffe.equals("3")) {
                System.out.println("Added Cappuccino to Your Order.");
                oderPrice = cappuccinoPrice;
            }
            // Step 4. Ask if they want another order:
            totalPrice = totalPrice + oderPrice;
            System.out.println("Do you want to add another order? (Yes/No) ");
            nextOder = input.nextLine();
        } while (nextOder.equals("Yes"));
        System.out.println("Your total is: " + totalPrice);
    }
}
/*
2. Create a class named CoffeeOrderApp with the following variables:

        - blackCoffeePrice: the price of black coffee
        - lattePrice: the price of a latte
        - cappuccinoPrice: the price of a cappuccino
        - totalPrice: the total cost of the user's order

    Create a straightforward coffee ordering application with these steps:

        Step 1. Ask the user if they want to order coffee.

            	Welcome to the Coffee Order App!

            Would you like to order coffee?


            If they say "yes", proceed to step #2. If they say "no", display "Thanks for using our service!"

            For any other response, the application should ask the user to re-enter until the user provides a valid entry.

        Step 2. Display the coffee options on the console:

            Coffee Options:
                1. Black Coffee - $blackCoffeePrice
                2. Latte - $lattePrice
                3. Cappuccino - $cappuccinoPrice

        Step 3. Ask the user to pick a coffee:

            3.1 If they choose 1, display "Added Black Coffee to Your Order."

            3.2 If they choose 2, display "Added Latte to Your Order."

            3.3 If they choose 3, display "Added Cappuccino to Your Order."

            3.4 If their choice is invalid, the application should ask the user to re-enter until the user provides a valid entry.


        Step 4. Ask if they want another order:

            If they say "yes," repeat from step #2.

            If they say "no," display the total cost of their order: "Your total is: $total."

            For any other response, the application should ask the user to re-enter until the user provides a valid entry.

 */