package additionalTasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // STEP 1. Given the following variables
        int pinNumber = 65432;

        // STEP 2. Ask the user to enter their pin number.
        Scanner input = new Scanner(System.in);
        boolean pinCorrect = false;
        int inputPinNumber;

        for (int attempt = 1; attempt <= 2 && !pinCorrect; attempt ++) {
            System.out.println("Enter you pin number: ");
            inputPinNumber = input.nextInt();
            pinCorrect = inputPinNumber == pinNumber;
            if (!pinCorrect) {
                System.err.println("Incorrect Pin Number, Please re-enter:");
                inputPinNumber = input.nextInt();
            }
        }
        if (!pinCorrect) {
            System.out.println("Your card is locked. Please contact with your local bank");
            return;
        }


    }
}
