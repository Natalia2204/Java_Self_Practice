package day05_practice_tasks;

public class MultiplicationTable {
    public static void main(String[] args) {
        int mul = 0;
        for (int i = 0; i < 10 ; i++) {
            for (int j = 0; j < 10; j++) {
                mul = j * i;
                System.out.print(j + " x " + i + " = " + mul + "   ");
            }
            System.out.println();
        }
    }
}
