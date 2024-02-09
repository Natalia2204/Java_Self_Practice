package day13_practice_Inheritance;

public class Developer extends Employee {
    public Developer(String name, int age, String gender, String employeeId, String jobTitle, double salary, String companyName) {
        super(name, age, gender, employeeId, jobTitle, salary, companyName);
    }

    public  String programmingLanguage;

    public Developer(String name, int age, String gender, String employeeId, String jobTitle, double salary, String companyName, String programmingLanguage) {
        super(name, age, gender, employeeId, jobTitle, salary, companyName);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        super.work();
        System.out.println(" is coding in " + programmingLanguage);
    }
}
