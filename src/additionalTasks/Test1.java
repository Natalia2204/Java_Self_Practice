package additionalTasks;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        double availableBalance = 120_000;

        Scanner input = new Scanner(System.in);
        System.out.println("Select one of the three following options: \n Check Balance \n Deposit Money \n Withdraw Money");

        String answerOption = input.nextLine();

        if (answerOption.equals("Check Balance")) {
            System.out.println(availableBalance);
        }

    }
}
