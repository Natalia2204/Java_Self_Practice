package day09_practice_tasks;

public class ClassMatesReversed {
    public static void main(String[] args) {

        //6.2 Store full names of 10 classmates.
        String [] classmates = new String[]{"Jon Smith", "Daniel Arron", "Jimmy Joe", "Mike Jonathan", "Breanna King",
                "Kate Moss", "Daniel Pal", "Alice Smith", "Robert Johnson", "Mike Lanon"};
       //6.3 Reverse each student's name and print them on separate lines.
        //System.out.println(classmates[1].substring(0,classmates[1].indexOf(' ')+1));

        for (int i = 0; i < classmates.length; i++) {
            String studentName = classmates[i].substring(0,classmates[i].indexOf(' ')+1);

            StringBuilder reversName = new StringBuilder(studentName);
            System.out.println(reversName.reverse());
        }



    }
}
/*
 Create a class named ClassMatesReversed and write a program with the following specifications:
   6.1 Create an array of strings named classmates.
   6.2 Store full names of 10 classmates.
   6.3 Reverse each student's name and print them on separate lines.

 */