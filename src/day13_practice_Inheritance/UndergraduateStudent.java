package day13_practice_Inheritance;

public class UndergraduateStudent extends StudentSubclass {


    public UndergraduateStudent(String name, int age, String gender, String studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
    }

    public static void main(String[] args) {
        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Tom", 24, "M","734D", "IT", 'B',"UMD");
        System.out.println(undergraduateStudent.toString());
        undergraduateStudent.study();
    }
}
/*
Create the following subclasses of the Student class:
   3.1 GraduateStudent:
       - Override the study method.
       - Add any additional fields and methods as necessary.

   3.2 UndergraduateStudent:
       - Same as GraduateStudent.
 */