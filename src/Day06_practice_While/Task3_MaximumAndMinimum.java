package Day06_practice_While;

public class Task3_MaximumAndMinimum {

    public static void main(String[] args) {

        int maxnumber = max(3, 12, 8);
        System.out.println(maxnumber);
        System.out.println("________________________");

        double maxDoubleNumber = max(5, 9);
        System.out.println(maxDoubleNumber);

        System.out.println("________________________");

        int minIntejernumber = min(4, 8);
        System.out.println("minIntejernumber = " + minIntejernumber);

        System.out.println("__________________________");
        double min = minDoublenamber(8.4, 9.6);
        System.out.println(min);

    }

    public static int max(int num1, int num2, int num3) {
        if (num1 < num2 && num3 < num2) {
            return num2;
        } else if (num2 < num1 && num3 < num1) {
            return num1;
        } else
            return num3;
    }

    public static double max(double a, double b) {
        if (a > b) {
            return a;
        }
        return b;
    }

        public static int min(int x, int y) {
        if (x > y) {
            return y;
        }
        return x;
    }
    public static double minDoublenamber(double c, double d) {
        if (c > d) {
            return d;
        }
        return c;
    }
}

/*
Create a class named MaximumAndMinimum:

	2.1 Create a method named max that returns the maximum number between two integer numbers.

	2.2 Create a method named max that returns the maximum number between two double numbers.

	2.3 Create a method named min that returns the minimum number between two integer numbers.

	2.4 Create a method named min that returns the minimum number between two double numbers.


			Example1:
				double n = max(10.5, 30.2);

			Output:
				30.2

			Example2:
				int m = min(100, 200);

			Output:
				100

 */