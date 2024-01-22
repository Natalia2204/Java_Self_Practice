package practice_replit;

import java.util.Scanner;

public class ListItems_swich {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hello, which item would you like?");
        String item = input.nextLine();

        int prices = 0;

        switch (item) {
            case "Blanket" -> prices = 60;
            case "Charger" -> prices = 5;
            case "Hat" -> prices = 25;
            case "Headphones" -> prices = 30;
            case "Laptop" -> prices = 200;
            case "Pants" -> prices = 50;
            case "Pillow" -> prices = 40;
            case "Smartphone" -> prices = 1000;
            case "Socks" -> prices = 5;
            case "USB cable" -> prices = 10;
            default -> {
                System.out.println("Sorry, that is an invalid item");
                return;
            }
        }

        if (prices > 100){
            System.out.println("Sorry, not enough funds on your gift card");
        }else {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100 - prices) + "$");
        }
    }
}
/*
** List of items, with prices, available in the store:**
If the item is not in the list, display message: Sorry, that is an invalid item
If the price of the item we want is more than $100, display message: Sorry, not enough funds on your gift card
Blanket: $60
Charger: $5
Hat: $25
Headphones: $30
Laptop: $200
Pants: $50
Pillow: $40
Smartphone: $1000
Socks: $5
USB cable: $10

Hello, which item would you like?
  Hat
  Thank you for your purchase!
  Your current balance is: 75$

  Hello, which item would you like?
  Pants
  Thank you for your purchase!
  Your current balance is: 50$

  Hello, which item would you like?
  Laptop
  Sorry, not enough funds on your gift card

  Hello, which item would you like?
  Cupcake
  Sorry, that is an invalid item


 */