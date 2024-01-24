package Day06_practice_While;

public class Task4_DayAndMonth {
    public static void main(String[] args) {

        int dayWeek = day(5);

        int dayMonth = monthName(8);

        int daysInMonth = daysInMonth(9);
    }

    public static int day (int dayNumber){
        switch (dayNumber){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Sunday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Invalid Number");
        }
        return dayNumber;
    }
    public static int monthName (int monthNumber){
       if (monthNumber < 1 || monthNumber > 12) {
           System.err.println("Invalid Number");
       }else {
           switch (monthNumber) {
               case 1 -> System.out.println("January");
               case 2 -> System.out.println("February");
               case 3 -> System.out.println("March");
               case 4 -> System.out.println("April");
               case 5 -> System.out.println("May");
               case 6 -> System.out.println("June");
               case 7 -> System.out.println("July");
               case 8 -> System.out.println("August");
               case 9 -> System.out.println("September");
               case 10 -> System.out.println("October");
               case 11 -> System.out.println("November");
               case 12 -> System.out.println("December");
           }
       }
        return monthNumber;
    }

    public static int daysInMonth(int dayMonth){
        switch (dayMonth) {
            case 1 -> System.out.println("January has 31 day");
            case 2 -> System.out.println("February has 28 day");
            case 3 -> System.out.println("March has 31 day");
            case 4 -> System.out.println("April has 30 day");
            case 5 -> System.out.println("May has 31 day ");
            case 6 -> System.out.println("June has 30 day");
            case 7 -> System.out.println("July has 31 day");
            case 8 -> System.out.println("August has 30 day");
            case 9 -> System.out.println("September has 31 day");
            case 10 -> System.out.println("October has 30 day");
            case 11 -> System.out.println("November has 30 day");
            case 12 -> System.out.println("December has 31 day");
            default -> System.out.println("Invalid Number");
        }
        return dayMonth;
    }


}
/*
January, February, March,March, April.May.June, July, August, September October.November December.
4. Create a class named DayAndMonth:

	3.1 Create a method named day that displays the day's name based on the given number.
	If the number is invalid, print "Invalid Number".

			Example:
				day(5);

			Output:
				Friday

	3.2 Create a method named monthName that displays the month's name based on the given number.
	If the number is invalid, print "Invalid Number."


			Example:
				monthName(6);

			Output:
				June

	3.3 Create a method named daysInMonth that displays the number of days in the month based on the given number.
	If the number is invalid, print "Invalid Number."

				Example:
					daysInMonth(6);

				Output:
					June has 30 days
 */
