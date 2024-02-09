package day13_practice_Inheritance;

public class PersonParentClass {

    private String name;
    private int age;
    private String gender;

    public PersonParentClass(String name, int age, String gender) {
        if (name == null || name.isEmpty() || name.isBlank() || gender == null || gender.isEmpty() || gender.isBlank()) {
            System.err.println("The name, gender  must not be null, empty, or blank.");
            System.exit(1);
        }
        if (age < 0) {
            System.err.println("The age must be greater than zero.");
            System.exit(1);
        }
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
/*
1. Create a class named "Student" with the following specifications:
   Attributes:
       - name: String
       - age: int
       - gender: String

   Encapsulation:
       - Same as previous tasks.

   Constructor:
       - Same as previous tasks.

   Actions:
       - toString(): Prints the information of the Student object.

 */