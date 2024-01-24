package day03_practice_tasks;

public class Task5 {
    public static void main(String[] args) {
       /* int a = 1985;
        int b = 1957;

        System.out.println( ( ((2024 - a) >=18 ) & (2024 - a) <= 65) );
        System.out.println( ( (2024 - b) >=18 & (2024 - b) <= 65) );

        */
        int age = 23;
        boolean isEligibale = age >= 18 && age <= 65;
        System.out.println("Am i eligible to work? " + isEligibale);

    }
}
