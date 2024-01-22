package practice_replit;

import java.util.Scanner;

public class CheckWordContains {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int index = word.indexOf("java");

        exists = index == 0 || index == 1;

        if (exists){
            System.out.println("true");
        }else {
            System.out.println("false\n");
            System.out.println("-> The 'java' is not in positions 0 or 1");
        }

        System.out.println(index);
    }
}
/*
checkWordContains the text
Use String methods to check if the given word contains the text java, but not anywhere in the String.
 The java text must be in either position 0 or position 1 of the String.
 If the text java appears in any other position
it is not valid and is not considered to be found in the String. Output a boolean value, true or false.
Ex:
  Input:
    javapython
  Output:
    true

Ex:
  Input:
    cjavac++
  Output:
    true

Ex:
  Input:
    c#javaruby
  Output:
    false
 */