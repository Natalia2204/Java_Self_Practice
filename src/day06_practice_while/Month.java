package day06_practice_while;

public class Month {
    public static void main(String[] args) {

        String result = monthName(4);
        System.out.println(result);
    }

    public static String monthName(int monthNumber) {
        String name = "Invalid Number";

        switch (monthNumber) {
            case 1 -> name = "January";
            case 2 -> name = "February";
            case 3 -> name = "March";
            case 4 -> name = "April";
            case 5 -> name = "May";
            case 6 -> name = "June";
            case 7 -> name = "July";
            case 8 -> name = "August";
            case 9 -> name = "September";
            case 10 -> name = "October";
            case 11 -> name = "November";
            case 12 -> name = "December";
        }
        return name;
    }
}
