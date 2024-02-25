package day17_practice_map;

import java.util.HashMap;
import java.util.Map;

public class MergeMaps {
    public static void main(String[] args) {

        Map<Character, Integer> map1 = new HashMap<>();
        map1.put('A', 10);
        map1.put('B', 20);

        Map<Character, Integer> map2 = new HashMap<>();
        map2.put('B', 30);
        map2.put('C', 40);

        for (Map.Entry<Character, Integer> entry : map2.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            if (map1.containsKey(key)) {
                map1.put(key, map1.get(key) + value);
            } else {
                map1.put(key, value);
            }
        }
        System.out.println(map1);
    }
}
/*
3. Create a class named MergeMaps and write a program that merge two given maps.
If a key is present in both maps, add their corresponding values together.

         Example:
               map1 = {'A'=10, 'B'=20}
               map2 = {'B'=30, 'C'=40}

         Output:
               {'A'=10, 'B'=50, 'C'=40}
 */