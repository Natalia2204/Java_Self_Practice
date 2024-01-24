package day05_practice_tasks;

public class Task7_Triangle {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(" * ");
            }

            System.out.println();
        }
    }
}
/*
Create a class named Triangle and use a nested loop to display the following shape on the console:

				*
				* *
				* * *
				* * * *
				* * * * *
				* * * * * *
				* * * * * * *
				* * * * * * * *
				* * * * * * * * *
				* * * * * * * * * *
 */