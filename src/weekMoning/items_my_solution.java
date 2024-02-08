package weekMoning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class items_my_solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Apple", "Cherry"));
        ArrayList<String> listUniqeWord = new ArrayList<>();

        for (String each : list) {
            if (!listUniqeWord.contains(each)) {
                listUniqeWord.add(each);
            }
        }

        int count = 0;

        for (int i = 0; i < listUniqeWord.size(); i++) {
            count += Collections.frequency(list, listUniqeWord.get(i));
            System.out.println(listUniqeWord.get(i) + " = " + count);
            count = 0;
        }
    }

}

/*
2. Given an ArrayList of Strings named 'items', write a program that returns the frequency of each element.
	   Example:
	      Input list: {"Apple", "Banana", "Apple", "Cherry"}

	   Output:
	      Apple = 2
	      Banana = 1
	      Cherry = 1
 */