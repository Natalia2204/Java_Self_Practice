package Day06_practice_While;

public class Task5_2MathUtility {
    public static void main(String[] args) {

        double result1 = calculate(9.8,6.5, '+');
        System.out.println("result1 = " + result1);
    }

    public static double calculate(double a, double b, char operator){

        double result;
        if(operator == '+'){
            result = a + b;
        } else if (operator == '-') {
            result = a - b;
        } else if (operator == '/') {
            result = a / b;
        }else if (operator == '*') {
            result = a * b;
        }else{
            result = 0;
        }
        return result;
    }
}
/*
5.2 Overload the calculate method to handle double numbers.

			Example:
				double result = calculate(2.5, '*', 3.0);

			Output:
				7.5

 */
