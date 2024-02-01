package day10_practice_ArrayList;

public class LettersDigitsSpecialChars {
    public static void main(String[] args) {

        String str = "Wooden Spoon123!";
        char[] strArray = str.toCharArray();

        StringBuilder letter = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        StringBuilder specialChars = new StringBuilder();

        for (char ch : strArray) {
            if(Character.isDigit(ch)){
                digits.append(ch);
            }else if (Character.isLetter(ch)) {
                letter.append(ch);
            }else {
                specialChars.append(ch);
            }
        }
        System.out.println(" letters= \"" + letter + "\"");
        System.out.println(" Digits = \"" + digits + "\"");
        System.out.println("\"specialChars = \"" + specialChars + "\"");
    }

}

/*
1. Create a class called LettersDigitsSpecialChars and write a program with the following specifications:
   1.1 Given a string, retrieve and display the letters, digits, and special characters separately.
   Example:

	        Example:
	            str = "Wooden Spoon123!"

	        output:
	            letters= "WoodenSpoon";
	            Digits = "123";
	            specialChars = " !";
 */