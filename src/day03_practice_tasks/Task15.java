package day03_practice_tasks;

public class Task15 {
    public static void main(String[] args) {

        String information = "Can i vote in this election?";

        int yourAge = 18;

        information += (yourAge > 18 ? "absolutly YES." : "unfortunatly," + "you shod wait a bit");

        System.out.println("information = " + information);
    }
}
