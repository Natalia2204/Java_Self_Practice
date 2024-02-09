package day13_practice_Inheritance;

public class Tester extends Employee {

    public Tester(String name, int age, String gender, String employeeId, String jobTitle, double salary, String companyName) {
        super(name, age, gender, employeeId, jobTitle, salary, companyName);
    }

    @Override
    public void work() {
        super.work();
        System.out.println(" is testing");
    }


}
/*
 Create the following subclasses of Employee:
   2.1 Tester:
       - work(): Displays "[jobTitle] [name] is testing".
 */