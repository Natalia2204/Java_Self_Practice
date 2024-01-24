package day01_practice_tasks;

public class EmployeeInfo {
    public static void main(String[] args) {
        String employeeName = "Shay";
        int age = 24;
        char gender = 'F';
        String companyName = "Apple inc";
        String jobTitle = "SDET";
        double yearsOfExperience = 2.5;
        int salary = 120_000;
        boolean isFullTime = true;
        boolean isMarried = false;
        String employeeId = "B101";

        System.out.println("Employee mane: " + employeeName);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Job title: " + jobTitle);
        System.out.println("Company name: " + companyName);
        System.out.println("Full time: " + isFullTime);
        System.out.println("Years of work experience: " + yearsOfExperience + " years");
        System.out.println("Salary: $" + salary + ".0");
        System.out.println("Married: " + isMarried);


    }
}
