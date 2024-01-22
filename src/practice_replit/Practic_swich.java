package practice_replit;

public class Practic_swich {
    public static void main(String[] args) {

        char grade = 'C';

        switch (grade){
            case 'A' -> System.out.println("Excellent");
            case 'B' -> System.out.println("Great job");
            default -> System.out.println("Invalid Grade");
        }
    }
}
/*
Create a class called Grade. A char variable named grade is given.
   Write a program to print the following messages:

		'A': Excellent
		'B': Great job
		'C': Good
		'D': Passed
		'F': Failed
		Otherwise: Invalid Grade

			Example:
				   grade = 'B'

			Output:
				  Great job
 */