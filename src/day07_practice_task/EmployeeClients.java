package day07_practice_task;

public class EmployeeClients {
    public static void main(String[] args) {
        Employee employee = new Employee();
        
        employee.name = "Helen";
        employee.age = 40;
        employee.gender = 'f';
        employee.jobTitle = "menedjer";
        employee.salary = 120_000;

        System.out.println("employee = " + employee);
        
        employee.work();
    }
}
