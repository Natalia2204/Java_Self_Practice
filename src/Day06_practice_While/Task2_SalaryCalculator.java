package Day06_practice_While;

public class Task2_SalaryCalculator {
    public static void main(String[] args) {

        double incom = salary(45, 40);
        System.out.println(incom);
    }
    public static double salary (double hourlyRate, int weeklyHours){
        return  hourlyRate * weeklyHours * 52;

    }
}
/*
Create a class named SalaryCalculator and create a method named salary that takes hourly rate (double)
and weekly hours (int) and returns the salary.

			Example:
				double income = salary(45, 40);

			Output:
				93600.0

 */