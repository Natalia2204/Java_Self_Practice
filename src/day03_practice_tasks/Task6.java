package day03_practice_tasks;

public class Task6 {
    public static void main(String[] args) {

        int appleCount = 3;
        int oraneCount = 5;
        int strawberryCount = 1;

        boolean result = (appleCount < oraneCount) | (oraneCount >= strawberryCount);

        System.out.println("result = " + result);


    }
}
