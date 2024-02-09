package day13_practice_Inheritance;

public class CydeoStudent extends Student {

    private int batchNumber;
    private int groupNumber;
    private String programmingLanguage;


    public CydeoStudent(String name, int age, String gender, String studentId, String fieldOfStudy, char grade,
                        String schoolName, int batchNumber, int groupNumber, String programmingLanguage) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
        if (programmingLanguage == null || programmingLanguage.isEmpty() || programmingLanguage.isBlank() ) {
            System.err.println("The name, gender  must not be null, empty, or blank.");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.programmingLanguage = programmingLanguage;
    }


    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        this.batchNumber = batchNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + getName()+ '\'' +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                "batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
/*
3 CydeoStudent:
       - Additional Attributes:
           - batchNumber: int
           - groupNumber: int
           - programmingLanguage: String
       - Encapsulation:
           - Same as previous tasks.
       - Constructor:
           - Same as previous tasks.
       - Actions:
           - Override the study method.
           - Override the toString method.
 */