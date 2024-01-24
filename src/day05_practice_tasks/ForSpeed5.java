package day05_practice_tasks;

public class ForSpeed5 {
    public static void main(String[] args) {

        System.out.println("KPH" + " " + "MPH");

        for (int i = 20; i < 141 ; i += 10) {
            int mph = (int) ((int) i * 0.62);
            System.out.println(i + " " + mph);
        }
    }
}
