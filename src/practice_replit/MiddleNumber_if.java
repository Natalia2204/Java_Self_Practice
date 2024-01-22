package practice_replit;

import java.util.Scanner;

public class MiddleNumber_if {
    public static void main(String[] args) {

        Scanner input =new Scanner (System.in);

        System.out.println("Enter first number:");
        int number1 = input.nextInt();

        System.out.println("Enter second number:");
        int number2 = input.nextInt();

        System.out.println("Enter third number:");
        int number3 = input.nextInt();

        input.close();

        int middlnumber;

        if (number1 < number2 && number2 < number3 || number3 < number2 && number2 < number1){
            middlnumber = number2;
        } else if (number1 < number3 && number3 < number2 || number2 < number3 && number3 < number1) {
            middlnumber = number3;
        }else {
            middlnumber = number1;
        }

        System.out.println("middle number is: " + middlnumber);


        /*
        Enter first number:
14
Enter second number:
52
Enter third number:
25
middle number is: 25
       Hint:
1. Create an object of Scanner class.
2. Declare int 3 variables
3. Use Scanner to assign numbers from console into the variables
4. Use if statements to find the middle number
1
2
3
-847
-87710
61

   */


    }
}
