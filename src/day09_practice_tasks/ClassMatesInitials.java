package day09_practice_tasks;

import java.util.Arrays;

public class ClassMatesInitials {
    public static void main(String[] args) {

        //2.1 Create an array of strings named classmates.
        String[] classmates;

        //2.2 Store full names of 10 classmates.
        classmates = new String[]{"Jon Smith", "Daniel Arron", "Jimmy Joe", "Mike Jonathan", "Breanna King",
                "Kate Moss", "Daniel Pal", "Alice Smith", "Robert Johnson", "Mike Lanon"};

        //2.3 Print the initials of each student's name in separate lines.
        String[] initials = new String[classmates.length];

        for (int i = 0; i < classmates.length; i++) {
            initials[i] = classmates[i].charAt(0) + "" + classmates[i].charAt(classmates[i].indexOf(" ") + 1);
            System.out.println(initials[i]);
        }


    }


}

/*
2. Create a class named ClassMatesInitials and write a program with the following specifications:
   2.1 Create an array of strings named classmates.
   2.2 Store full names of 10 classmates.
   2.3 Print the initials of each student's name in separate lines.

 */