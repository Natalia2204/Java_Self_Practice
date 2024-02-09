package day13_practice_Inheritance;

public class Employee extends PersonParentClass {
    public Employee(String name, int age, String gender) {
        super(name, age, gender);
    }

    private String employeeId;
    private String jobTitle;
    private double salary;
    private String companyName;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Employee(String name, int age, String gender, String employeeId, String jobTitle, double salary,
                    String companyName) {
        super(name, age, gender);
        if (employeeId == null || employeeId.isEmpty() || employeeId.isBlank() || jobTitle == null || jobTitle.isEmpty() || jobTitle.isBlank()) {
            System.err.println("The employeeId, jobTitle, companyName  must not be null, empty, or blank.");
            System.exit(1);
        }
        if (salary < 0) {
            System.err.println("The salary must be greater than zero.");
            System.exit(1);
        }
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.companyName = companyName;
    }
    public void work(){
        System.out.print( jobTitle + " " + getName());
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender='" + getGender() +
                "employeeId='" + employeeId + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
/*
1. Create a subclass of Person named "Employee" with the following specifications:
   Attributes:
       - employeeId: String
       - jobTitle: String
       - salary: double
       - companyName: String

   Encapsulation:
       - Same as previous tasks.

   Constructor:
       - Same as previous tasks.

   Methods:
       - work(): Displays the employee's job title and name.
       - toString(): Returns a string representation of the Employee object.
 */
