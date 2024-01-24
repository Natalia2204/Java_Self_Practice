package WeekMoning4;

public class MortgageCalculator {
    public static void main(String[] args) {

        int loanAmount = 500_000; //Represents the loan amount.
        int loanTermInYears = 30; //Represents the loan term in years.
        String loanType = "FHA"; //Represents the type of loan.
        double annualInterestRate = 0.0;

      /*  if (loanType == "Fixed" && loanTermInYears == 30){
            annualInterestRate = 7.5;
        }else if (loanType == "Fixed" && loanTermInYears == 30){
            annualInterestRate = 6.9;
        }else if (loanType == "FHA" && loanTermInYears == 30){
            annualInterestRate = 7.24;
        }else if (loanType == "FHA" && loanTermInYears == 15){
            annualInterestRate = 6.62;
        }else if (loanType == "VA" && loanTermInYears == 30) {
            annualInterestRate = 6.75;
        }else if (loanType == "VA" && loanTermInYears == 15){
            annualInterestRate = 5.99;
        }
*/

      /*  if(loanType == "Fixed"){
            if (loanTermInYears == 30) annualInterestRate = 7.5;
            if (loanTermInYears == 15) annualInterestRate = 6.9;
        }if(loanType == "FHA"){
            if (loanTermInYears == 30) annualInterestRate = 7.24;
            if (loanTermInYears == 15) annualInterestRate = 6.62;
        }if(loanType == "VA") {
            if (loanTermInYears == 30) annualInterestRate = 6.75;
            if (loanTermInYears == 15) annualInterestRate = 5.99;
        }

       */

        /*
        double annualInterestRate = (loanType == "Fixed" && loanTermInYears == 30) ? 7.5 :
                (loanType == "Fixed" && loanTermInYears == 15) ? 6.9 :
                        (loanType == "FHA" && loanTermInYears == 30) ? 7.24 :
                                (loanType == "FHA" && loanTermInYears == 15) ? 6.62 :
                                        (loanType == "VA" && loanTermInYears == 30) ? 6.75 :
                                                (loanType == "VA" && loanTermInYears == 30) ? 5.99 : 0.0;
*/

        switch (loanType){
            case "Fixed":
                if (loanTermInYears == 30) annualInterestRate = 7.5;
                if (loanTermInYears == 15) annualInterestRate = 6.9;
                break;
            case "FHA":
                if (loanTermInYears == 30) annualInterestRate = 7.24;
                if (loanTermInYears == 15) annualInterestRate = 6.62;
                break;
            case  "VA":
                if (loanTermInYears == 30) annualInterestRate = 6.75;
                if (loanTermInYears == 15) annualInterestRate = 5.99;
                break;
        }

        double monthlyInterestRate = annualInterestRate / 100 / 12;
        int numberOfPayments = loanTermInYears * 12;
        double monthlyPayment = (loanAmount * monthlyInterestRate) /
                (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));

        double roundMonthPayment = Math.round(monthlyPayment);

        System.out.println("Your monthly mortgage payment for a " + loanTermInYears + " Year " + loanType
                + " loan is: " + monthlyPayment);

        System.out.println("roundMonthPayment = " + roundMonthPayment);
        

    }
}
/*
Create a Java class named MortgageCalculator with the following requirements:

    2.1 Define the following variables:

	        loanAmount: Represents the loan amount.
	        loanTermInYears: Represents the loan term in years.
	        loanType: Represents the type of loan.

    2.2 Determine the annual interest rates for different loan types:

            Fixed:
                30 years: 7.5%
                15 years: 6.9%

            FHA:
                30 years: 7.24%
                15 years: 6.62%

            VA:
                30 years: 6.75%
                15 years: 5.99%

    2.3 Write a program to calculate the monthly mortgage payment using the following formula:

        monthlyInterestRate = annualInterestRate / 100 / 12
        numberOfPayments = loanTermInYears * 12
        monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments))


    2.4 Display the output in the following format:

            Example 1:
                loanAmount = $500,000
                loanTermInYears = 30
                loanType = "Fixed"

            Output:
                Your monthly mortgage payment for a 30 Yr. Fixed loan is: $3,496.00


    Ensure that the program accurately calculates the monthly mortgage payment based on the
    specified loan amount, term, and type.
 */
