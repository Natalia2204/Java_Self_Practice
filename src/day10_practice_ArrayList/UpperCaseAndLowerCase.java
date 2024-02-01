package day10_practice_ArrayList;

public class UpperCaseAndLowerCase {
    public static void main(String[] args) {

        String str = "JAVA java ss DD";
        char[] strArray = str.toCharArray();

        int upperCase = 0;
        int lowCase = 0;

        for (char ch : strArray) {
            if (Character.isUpperCase(ch)) {
                upperCase++;
            } else if (Character.isLowerCase(ch)) {
                lowCase++;
            }
        }
        boolean result = upperCase == lowCase;
        System.out.println(result);

    }
}
/*

2. Create a class called UpperCaseAndLowerCase and write a program with the following specifications:
   2.1 Given a string, return true if the total number of uppercase characters is equal to the total number of lowercase characters.

	        Eamplex:
	            str = "JAVA java";

	        output:
	            true
 */