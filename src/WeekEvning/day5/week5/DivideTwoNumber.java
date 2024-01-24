package WeekEvning.day5.week5;

public class DivideTwoNumber {
    public static void main(String[] args) {

        int num1 = 100;
        int num2 = 6;
        /*
        103-20=83
        83-20=63
        63-20=43
        43-20=23
        23-20=3
         */

        int counter = 0;
        while (num1 >= num2){
            num1 = num1 - num2;
            counter++;
        }

        //System.out.println(num1);
        //System.out.println(counter);

        System.out.println(counter + " with a remainder of " + num1);


    }



}
/*
1. Create a class named DivideTwoNumbers and write a program that can perform division of
two numbers without using the division (/) and multiplication (*) operators.

		Example:
			n1 = 100
			n2 = 6

		Output:
			16 with a remainder of 4

 */