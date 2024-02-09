package day13_practice_Inheritance;

public class EmployeeClients {
    public static void main(String[] args) {
        Tester tester = new Tester("Jac", 35, "M", "344","SDET",
                90000.0,"Amazon");
        System.out.println(tester);
        tester.work();

        Developer developer = new Developer("Tom", 45, "M", "672", "Developer",
                120000.0, "Google", "Java");
        System.out.println(developer);
        developer.work();

        Driver driver = new Driver("Denis", 28, "M", "4352", "Driver",
                60000.0, "TaK");
        System.out.println(driver);
        driver.work();

        Teacher teacher = new Teacher("Jane", 39, "F", "4433", "Teacher",
                70000.0, "School");
        System.out.println(teacher);
        teacher.work();

    }
}
