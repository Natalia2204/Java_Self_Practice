package day05_practice_tasks;

public class Task6_FINRA {
    public static void main(String[] args) {


        for (int i = 1; i <=20 ; i++) {
            if (i % 3 == 0){
                System.out.print(" FIN");
            } else if (i % 5 == 0) {
                System.out.print(" RA ");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(" FINRA");
            }else
                System.out.print(" " + i + " ");
        }
    }
}
/*
Create a class named FINRA. and write a program that prints the numbers from 1 to 100. For numbers that
are multiples of both 3 and 5, print "FINRA" instead of the number. For numbers that are multiples of 3, print
"FIN" instead of the number, and for numbers that are multiples of 5, print "RA" instead of the number.

				Example:
					1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN...
 */