package day03_practice_tasks;

public class SalaryCalculator {
    public static void main(String[] args) {
         double hourlyRate = 50;
         int weeklyHours = 45;
         double stateTaxRate = 6;  //given as a percentage
         double federalTaxRate = 26;//given as a percentage

        double grossPay = hourlyRate * weeklyHours * 52;
        double federalTax = (grossPay * federalTaxRate)/100;
        double stateTax = (grossPay * stateTaxRate)/100;
        double totalTax = federalTax + stateTax;
        double selaryAfterTax = grossPay - totalTax;

        System.out.println("Gross pay is: $" + grossPay);
        System.out.println("Federal tax is: $" + federalTax);
        System.out.println("State tax is: $" + stateTax);
        System.out.println("Tota tax is: $"+ totalTax);
        System.out.println("Net incom is: $" + selaryAfterTax);


    }
}
