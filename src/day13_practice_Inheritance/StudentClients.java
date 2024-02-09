package day13_practice_Inheritance;

public class StudentClients {
    public static void main(String[] args) {

        CydeoStudent cydeoStudent = new CydeoStudent("Tom", 25, "M", "3456a", "IT",
                'A', "Cydeo", 34566, 12,"Java");

        System.out.println(cydeoStudent.toString());
        cydeoStudent.study();

        GraduateStudent graduateStudent = new GraduateStudent("Jane", 24,"F", "876",
                "IT", 'A', "MIT" );
        System.out.println(graduateStudent.toString());
        graduateStudent.study();

        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Kate", 28, "F", "546",
                "IT", 'B', "UMD");
        System.out.println(undergraduateStudent);
        undergraduateStudent.study();
    }
}
