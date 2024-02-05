package day11_practice_constructors;

public class CydeoStudentClients {
    public static void main(String[] args) {

        CydeoStudent cydeoStudent = new CydeoStudent("Jane", 38,45378,'A', 4579,12 );
        System.out.println(cydeoStudent);

        CydeoStudent.schoolName = "Cydeo";
        CydeoStudent.programmingLanguage = "Java";
        cydeoStudent.study();
        cydeoStudent.attendClass();
        cydeoStudent.printSchoolName();
        cydeoStudent.printProgLanguage();

    }
}
/*
Create another class named CydeoStudentClients, create multiple CydeoStudent objects,
	 and test each function of the CydeoStudent object.
 */