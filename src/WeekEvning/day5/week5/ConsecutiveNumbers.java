package WeekEvning.day5.week5;

public class ConsecutiveNumbers {
    public static void main(String[] args) {

        System.out.println(consecutiveNumbers(31));
    }

    public static String consecutiveNumbers(int n) {

        String result = "";

        for (int i = 1; i <= n; i++) {

            String temp = "";

            if (i % 2 == 0) {
                temp += "Codility";
            }
            if (i % 3 == 0) {
                temp += "Test";
            }
            if (i % 5 == 0) {
                temp += "Coders";
            }
            if (temp.isEmpty()) {
                temp += "" + i;
            }
            result += temp + "\n";
        }
        return result;
    }
}
/*
2. Create a class named ConsecutiveNumbers and implement a function with the following specifications:
	Given a positive integer N, the function should print consecutive numbers from 1 to N, with each number on a separate line.

	However, there are special rules for certain numbers:
		If a number is divisible by 2, replace it with the word "Codility".
		If divisible by 3, replace it with "Test".
		If divisible by 5, replace it with "Coders".
		If a number is divisible by more than one of these numbers (2, 3, or 5), replace it with a combination of the respective words in the order Codility, Test, and Coders.

	For example:
		Numbers divisible by both 2 and 3 should be replaced by "CodilityTest".
		Numbers divisible by both 2 and 5 should be replaced by "CodilityCoders".
		Numbers divisible by both 3 and 5 should be replaced by "TestCoders".
		Numbers divisible by all three (2, 3, and 5) should be replaced by "CodilityTestCoders".


			Here's an example of the function call:
			 	consecutiveNums(17);

		 	Output:
					1
					Codility
					Test
					Codility
					Coders
					CodilityTest
					7
					Codility
					Test
					CodilityCoders
					11
					CodilityTest
					13
					Codility
					TestCoders
					Codility
					17
 */