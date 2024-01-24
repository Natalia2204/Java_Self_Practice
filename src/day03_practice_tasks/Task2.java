package day03_practice_tasks;

public class Task2 {
    public static void main(String[] args) {
        int a = 10;
        a = --a + a++ + a-- + a++;

        System.out.println("a = " + a);// 9 + 9 + 10 + 9 = 37
        System.out.println("a = " + a); //37

    }
}
