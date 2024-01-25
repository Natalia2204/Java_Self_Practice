package additionalTasks;

import java.util.Scanner;

public class ATMSimulation {
    public static void main(String[] args) {
        // STEP 1. Given the following variables
        int pinNumber = 65432;
        double availableBalance = 120_000;
        // STEP 2. Ask the user to enter their pin number.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you pin number: ");
        int inputPinNumber = input.nextInt();

        if (!(inputPinNumber == pinNumber)) {
            System.out.println("Incorrect Pin Number, Please re-enter:");
            inputPinNumber = input.nextInt();
        }
        if (!(inputPinNumber == pinNumber)) {
            System.out.println("Incorrect Pin Number, Please re-enter:");
            inputPinNumber = input.nextInt();
        }
        if (!(inputPinNumber == pinNumber)) {
            System.err.println("Your card is locked. Please contact with your local bank");
            return;
        }
        input.nextLine();
        // STEP 3. Select from one of the three following options:Check Balance, Deposit Money, Withdraw Money
        System.out.println("Select one of the three following options: \n Check Balance \n Deposit Money \n Withdraw Money");
        String answerOption = input.nextLine();
        //STEP 3.1 Check Balance:
        if (answerOption.equals("Check Balance")) {
            System.out.println("Available balance: " + availableBalance);
            return;
        }
        // STEP 3.2 Deposit Money:
        if (answerOption.equals("Deposit Money")) {
            System.out.println("Enter the amount to deposit: ");
            double amountDeposit = input.nextDouble();
            if (amountDeposit <= 0) {
                System.err.println("Depositing amount cannot be zero or negative, please try again later.");
                return;
            } else {
                availableBalance = availableBalance + amountDeposit;
                System.out.println("Available balance: " + availableBalance);
                return;
            }
        }
        //STEP 3.3 Withdraw Money:
        if (answerOption.equals("Withdraw Money")) {
            System.out.println("Enter the amount to withdraw:");
            double amountWithdraw = input.nextDouble();
            if (amountWithdraw <= 0) {
                System.err.println("Cannot withdraw zero or negative amount, please try again later.");
                return;
            } else if (amountWithdraw > availableBalance) {
                System.err.println("Insufficient funds. Withdrawal failed.");
                return;
            } else {
                availableBalance = availableBalance - amountWithdraw;
                System.out.println("Available balance: " + availableBalance);
                return;
            }
        } else //	3.4 If the user does not select one of the three options above
            System.err.println("Invalid choice. Exiting the ATM. Thank you for using our services!");
        return;
    }
}





/*
1. Create a class named ATMSimulation. Write a program with the following requirements:

   1. Given the following variables:
      - pinNumber: contains the correct pin number of the card
      - accountBalance: current account balance of the card

   2. Ask the user to enter their pin number.
      If the user-entered pin number does not match the correct pin number, give 2 more attempts for user to re-enter.
      		"Incorrect Pin Number, Please re-enter:"

      If all the attempts are failed, then the program should be terminated with the following error message:
      	"Your card is locked. Please contact with your local bank"

   3. If user entered the valid pin number, Ask the user to select from one of the three following options:
      	3.1 Check Balance:
          Displays the available balance.

      	3.2 Deposit Money:
          Asks the user to enter the amount to deposit and displays the new available balance.

          If the user enters an invalid amount (0 or negative), then the program should
          be terminated with the following error message:
          	"Depositing amount cannot be zero or negative, please try again later."

      	3.3 Withdraw Money:
          Asks the user to enter the amount to withdraw and displays the new available balance.

          If the user enters an invalid amount (0 or negative), then the program should
          be terminated with the following error message:
          	"Cannot withdraw zero or negative amount, please try again later."

          If the user-entered amount is greater than the available balance, then the program
          should be terminated with the following error message:
          	"Insufficient funds. Withdrawal failed."

	   	3.4 If the user does not select one of the three options above, then the following
   			error message should be displayed on the console:
	      		"Invalid choice. Exiting the ATM. Thank you for using our services!"

 */