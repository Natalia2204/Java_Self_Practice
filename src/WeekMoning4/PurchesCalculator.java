package WeekMoning4;

public class PurchesCalculator {
    public static void main(String[] args) {

        String itemName = "Fuji Apple";
        double unitPrice = 1.5;
        int quantity = 5;
        double salesTaxRate = 0.08;

        System.out.println("Item name: " + itemName);
        System.out.println("Unit price: $" + unitPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println();
        System.out.println("Total cost before tax:$ " + quantity * unitPrice);
        System.out.println("Sales tax: $ " + (quantity * unitPrice) * salesTaxRate);
        System.out.println("======================================================");
        System.out.println("Grand Total: $" + ((quantity * unitPrice) + ((quantity * unitPrice) * salesTaxRate)));
    }

}
/*
Create a class named PurchaseCalculator.

 	1.1 Given the following variables:
           - salesTaxRate (double)
           - itemName (String)
           - unitPrice (double)
           - quantity (int)

    1.2 The program should calculate the total cost before tax, the sales tax, and the grand total.

    1.3 The program should display them on the console in the following format:

         Example:
	           itemName = "Fuji Apple"
	           unitPrice = 1.5
	           quantity = 5
	           salesTaxRate = 8

         Output:
	           Item name: Fuji Apple
	           Unit price: $1.5
	           Quantity: 5

	           Total cost before tax: $7.5
	           Sales tax: $0.6
	           ==========================
	           Grand Total: $8.1
 */