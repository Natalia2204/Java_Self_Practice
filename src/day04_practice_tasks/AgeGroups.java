package day04_practice_tasks;

public class AgeGroups {
    public static void main(String[] args) {
        int age = 1;

        if (age > 0 && age < 150) {
            if (age <= 20) {
                System.out.println("Teenager");
            } else if (age >= 21 && age <= 55) {
                    System.out.println("Adult");
            } else {
                System.out.println("Senior");
            }
        } else System.out.println("Invalid");
    }
}
/*
. Create a class named AgeGroups. An integer variable named age is given.
	Write a program that can determine the age group of a person. The age groups are:

		Teenager (0 ~ 20)
		Adult   (21 ~ 55)
      Senior  (55 or older)

		If the age is negative or greater than 150, print "Invalid."


			Example:
				   age = 42

			Output:
				  Young Middle-Aged Adult

 */
