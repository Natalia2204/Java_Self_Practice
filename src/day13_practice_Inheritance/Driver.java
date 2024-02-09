package day13_practice_Inheritance;

public class Driver extends Employee {


    public Driver(String name, int age, String gender, String employeeId, String jobTitle, double salary, String companyName) {
        super(name, age, gender, employeeId, jobTitle, salary, companyName);
    }

    @Override
    public void work() {
        super.work();
        System.out.println(" is driving ");
    }
}
