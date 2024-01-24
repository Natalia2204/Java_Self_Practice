package day03_practice_tasks;

public class Task4 {
    public static void main(String[] args) {
        int b = 2;
        boolean result = (++b == 2 || b == 2) && --b == 2;
        // false && false ==> false
        System.out.println(result); //false
        System.out.println(b); //3 becous &&

    }
}
