package weekMoning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class identifies {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Java", "Python", "Python", "Ruby", "Ruby", "C#"));
        ArrayList<String> uniqueElements = new ArrayList<>(list);
        uniqueElements.removeIf(p-> Collections.frequency(uniqueElements,p)>1);
        System.out.println(uniqueElements);
    }
}
/*
1. Write a program that identifies the unique elements in an array of Strings.
		   Example:
		      Input array: {"Java", "Python", "Python", "Ruby", "Ruby", "C#"}

		   Output:
		      Java
		      C#
 */